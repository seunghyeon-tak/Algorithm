package algo.implementation;

import java.util.Arrays;
import java.util.Collections;

public class PGS_135808_FruitSeller {
    public static void main(String[] args) {
        System.out.println(solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    static int solution(int k, int m, int[] score) {
        int answer = 0;

        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length / m; i++) {
            answer += arr[(i + 1) * m - 1] * m;
        }


        return answer;
    }
}
