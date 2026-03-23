package algo.implementation;

import java.util.Arrays;

public class PGS_42862_WorkoutClothes {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{3}, new int[]{1}));
    }

    static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n + 2];

        Arrays.fill(student, 1);

        for (int l : lost) {
            student[l]--;
        }

        for (int r : reserve) {
            student[r]++;
        }

        for (int i = 1; i < student.length; i++) {
            if (student[i] > 1 && student[i - 1] == 0) {
                student[i]--;
                student[i - 1]++;
            } else if (student[i] > 1 && student[i + 1] == 0) {
                student[i]--;
                student[i + 1]++;
            }
        }

        for (int i = 1; i < student.length - 1; i++) {
            if (student[i] > 0)
                answer++;
        }

        return answer;
    }
}
