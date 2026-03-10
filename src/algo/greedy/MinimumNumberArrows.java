package algo.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberArrows {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 6}, {7, 12}, {2, 8}, {10, 16}}));
    }

    static int solution(int[][] balloon) {
        Arrays.sort(balloon, Comparator.comparingInt(a -> a[1]));

        int arrow = 1;
        int x = balloon[0][1];

        for (int i = 1; i < balloon.length; i++) {
            if (balloon[i][0] > x) {
                arrow++;
                x = balloon[i][1];
            }
        }

        return arrow;
    }
}
