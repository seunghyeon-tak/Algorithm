package algo.implementation;

public class PGS_132267_cola_exchange {
    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
    }

    static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int used = (n / a) * a;
            int received = (n / a) * b;

            answer += received;

            n = n - used + received;
        }

        return answer;
    }
}
