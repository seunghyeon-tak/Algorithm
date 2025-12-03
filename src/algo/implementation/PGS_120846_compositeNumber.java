package algo.implementation;

public class PGS_120846_compositeNumber {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    static int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count >= 3) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
