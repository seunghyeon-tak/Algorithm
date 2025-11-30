package algo.implementation;

import java.util.Arrays;

public class PGS_120844_arrayRotate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "right")));
    }

    static int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];

        if ("right".equals(direction)) {
            answer[0] = numbers[len - 1];
            for (int i = 1; i < len; i++) {
                answer[i] = numbers[i - 1];
            }
        } else if ("left".equals(direction)) {
            answer[len - 1] = numbers[0];
            for (int i = 0; i < len - 1; i++) {
                answer[i] = numbers[i + 1];
            }
        }

        return answer;
    }
}
