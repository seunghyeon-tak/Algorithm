package algo.implementation;

import java.util.ArrayDeque;

public class PGS_64061_CraneClawMachine {
    public static void main(String[] args) {
        System.out.println(solution(
                new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
                new int[]{1, 5, 3, 5, 1, 2, 1, 4}
        ));
    }

    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int move : moves) {
            int col = move - 1;
            for (int[] b : board) {
                if (b[col] == 0) continue;
                if (!stack.isEmpty() && stack.peek() == b[col]) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(b[col]);
                }

                b[col] = 0;
                break;
            }
        }

        return answer;
    }
}
