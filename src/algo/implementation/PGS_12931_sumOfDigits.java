package algo.implementation;

public class PGS_12931_sumOfDigits {
    public static void main(String[] args) {
        System.out.println(solution(987));
    }

    static int solution(int n) {
        int answer = 0;

        char[] charArray = String.valueOf(n).toCharArray();

        for (char c : charArray) {
            answer += c - '0';
        }

        return answer;
    }
}
