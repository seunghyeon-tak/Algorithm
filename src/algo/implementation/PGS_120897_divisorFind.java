package algo.implementation;

import java.util.ArrayList;
import java.util.Arrays;

public class PGS_120897_divisorFind {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));
    }

    static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
