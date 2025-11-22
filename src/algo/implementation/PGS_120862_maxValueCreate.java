package algo.implementation;

public class PGS_120862_maxValueCreate {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, -3, 4, -5}));
    }

    static int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int prod = numbers[i] * numbers[j];
                if (prod > answer) answer = prod;
            }
        }

        return answer;
    }
}
