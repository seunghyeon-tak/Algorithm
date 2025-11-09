package algo.implementation;

import java.util.Arrays;

public class PGS_181923_SequenceQuery2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{9, 8, 7, 6, 5}, new int[][]{{0, 4, 7}, {1, 3, 5}, {2, 2, 6}})));
    }

    static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int best = Integer.MAX_VALUE;
            for (int j = s; j <= e; j++) {
                int v = arr[j];
                if (v > k && v < best) {
                    best = v;
                }
            }

            answer[i] = (best == Integer.MAX_VALUE) ? -1 : best;
        }

        return answer;
    }
}
