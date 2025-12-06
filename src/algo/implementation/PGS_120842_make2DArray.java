package algo.implementation;

import java.util.Arrays;

public class PGS_120842_make2DArray {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }

    static int[][] solution(int[] num_list, int n) {
        int m = num_list.length / n;
        int[][] answer = new int[m][n];

        int count = 0;
        int[] curr = new int[n];
        int x = 0;

        for (int j : num_list) {
            curr[count] = j;

            if (count == n - 1) {
                answer[x] = curr;
                count = 0;
                x++;
                curr = new int[n];
            } else {
                count++;
            }
        }

        return answer;
    }
}
