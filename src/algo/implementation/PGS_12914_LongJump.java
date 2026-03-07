package algo.implementation;

public class PGS_12914_LongJump {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    static long solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        long[] dp = new long[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
        }

        return dp[n];
    }
}
