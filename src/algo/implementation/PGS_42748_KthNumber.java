package algo.implementation;

import java.util.Arrays;

public class PGS_42748_KthNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}
        )));
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int len = 0;
        for (int[] c : commands) {
            int i = c[0] - 1;
            int j = c[1];
            int k = c[2] - 1;
            int[] split = Arrays.copyOfRange(array, i, j);
            Arrays.sort(split);
            answer[len++] = split[k];
        }

        return answer;
    }
}
