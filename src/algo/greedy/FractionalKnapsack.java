package algo.greedy;

import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args) {
        System.out.println(solution(10, new int[][]{{6, 30}, {3, 14}, {4, 16}, {2, 9}}));
    }

    static double solution(int capacity, int[][] items) {
        Arrays.sort(items, (a, b) -> Double.compare((double) b[1] / b[0], (double) a[1] / a[0]));
        double answer = 0;

        for (int[] item : items) {
            int weight = item[0];
            int value = item[1];

            if (capacity == 0) {
                break;
            }

            if (capacity >= weight) {
                capacity -= weight;
                answer += value;
            } else {
                answer += (double) value * capacity / weight;
                capacity = 0;
            }
        }

        return answer;
    }
}
