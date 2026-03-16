package algo.implementation;

import java.util.ArrayList;
import java.util.Arrays;

public class PGS_42840_MockTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    static int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int totalA = 0;
        int totalB = 0;
        int totalC = 0;

        for (int i = 0; i < answers.length; i++) {
            int correct = answers[i];
            int aCorrect = A[i % A.length];
            int bCorrect = B[i % B.length];
            int cCorrect = C[i % C.length];

            if (aCorrect == correct) totalA++;
            if (bCorrect == correct) totalB++;
            if (cCorrect == correct) totalC++;
        }

        int max = Math.max(totalA, Math.max(totalB, totalC));

        if (totalA == max) answer.add(1);
        if (totalB == max) answer.add(2);
        if (totalC == max) answer.add(3);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
