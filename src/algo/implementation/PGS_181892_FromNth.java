package algo.implementation;

import java.util.Arrays;

// n번째 원소 부터
public class PGS_181892_FromNth {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 2)));
    }

    static int[] solution(int[] num_list, int n) {
        int start = n - 1;
        int[] answer = new int[num_list.length - start];

        for (int i = 0; i < num_list.length; i++) {
            if (i >= n - 1) {
                answer[i - start] = num_list[i];
            }
        }

        return answer;
    }
}
