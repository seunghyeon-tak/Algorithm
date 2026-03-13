package algo.implementation;

import java.util.Arrays;

public class PGS_42889_FailureRate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }

    static int[] solution(int n, int[] stages) {
        int[] count = new int[n + 2];

        for (int stage : stages) {
            count[stage]++;
        }

        double[] failRates = new double[n + 1];
        int players = stages.length;

        for (int i = 1; i <= n; i++) {
            if (players != 0)
                failRates[i] = (double) count[i] / players;
            players -= count[i];
        }

        Integer[] stageNums = new Integer[n];
        for (int i = 0; i < n; i++) {
            stageNums[i] = i + 1;
        }

        Arrays.sort(stageNums, (a, b) -> {
            if (failRates[a] == failRates[b])
                return a - b;
            return Double.compare(failRates[b], failRates[a]);
        });

        return Arrays.stream(stageNums).mapToInt(i -> i).toArray();
    }
}
