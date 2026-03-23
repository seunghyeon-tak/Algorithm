package algo.implementation;

public class PGS_42883_MakingBigNumber {
    public static void main(String[] args) {
        System.out.println(solution("4177252841", 4));
    }

    static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        for (char c : number.toCharArray()) {
            while (k > 0 && answer.length() > 0 && answer.charAt(answer.length() - 1) < c) {
                answer.deleteCharAt(answer.length() - 1);
                k--;
            }
            answer.append(c);
        }

        if (k > 0) {
            answer = new StringBuilder(answer.substring(0, answer.length() - k));
        }

        return answer.toString();
    }
}
