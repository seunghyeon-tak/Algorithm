package algo.implementation;

import java.util.Arrays;

public class PGS_181893_ArraySlice {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2})));
    }

    static int[] solution(int[] arr, int[] query) {
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            int q = query[i];
            if (i % 2 == 0) {
                right = left + q;
            } else {
                left = left + q;
            }
        }

        return Arrays.copyOfRange(arr, left, right + 1);
    }
}
