package algo.implementation;

import java.util.Arrays;

public class PGS_181830_PerfectSquare {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{572, 22, 37, 1}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}})));
    }

    static int[][] solution(int[][] arr) {
        if (arr == null) {
            return new int[0][0];
        }

        int rows = arr.length;
        int cols = 0;

        for (int i = 0; i < rows; i++) {
            if (arr[i] != null) {
                cols = Math.max(cols, arr[i].length);
            }
        }

        if (rows == cols) {
            return arr;
        }

        int size = Math.max(rows, cols);
        int[][] result = new int[size][size];

        for (int i = 0; i < rows; i++) {
            if (arr[i] == null) {
                continue;
            }
            int limit = Math.min(arr[i].length, size);
            for (int j = 0; j < limit; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }
}
