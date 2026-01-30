package algo.implementation;

public class PGS_131128_numberPartner {
    public static void main(String[] args) {
        System.out.println(solution("100", "203045"));
    }

    static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (int i = 0; i < X.length(); i++) {
            xCount[X.charAt(i) - '0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            yCount[Y.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            int min = Math.min(xCount[i], yCount[i]);

            while (min-- > 0) {
                answer.append(i);
            }
        }

        if (answer.isEmpty()) {
            return "-1";
        }

        if (answer.charAt(0) == '0') {
            return "0";
        }

        return String.valueOf(answer);
    }
}
