package algo.implementation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PGS_389478_pickUpBoxes {
    public static void main(String[] args) {
        System.out.println(solution(13, 3, 6));
    }

    static int solution(int n, int w, int num) {
        List<Deque<Integer>> stack = new ArrayList<>();

        for (int i = 0; i < w; i++) {
            stack.add(new ArrayDeque<>());
        }

        int row = 0;
        int box = 1;

        while (box <= n) {
            if (row % 2 == 0) {
                for (int i = 0; i < w && box <= n; i++) {
                    stack.get(i).push(box++);
                }
            } else {
                for (int i = w - 1; i >= 0 && box <= n; i--) {
                    stack.get(i).push(box++);
                }
            }
            row++;
        }

        int targetCol = -1;

        for (int i = 0; i < w; i++) {
            if (stack.get(i).contains(num)) {
                targetCol = i;
                break;
            }
        }

        int count = 0;

        while (!stack.get(targetCol).isEmpty()) {
            count++;
            if (stack.get(targetCol).pop() == num) break;
        }

        return count;
    }
}
