package algo.implementation;

public class PGS_12951_createJadenCaseString {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
    }

    static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isStart = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                isStart = true;
                answer.append(" ");
                continue;
            }

            if (isStart) {
                answer.append(Character.isDigit(c) ? c : Character.toUpperCase(c));
                isStart = false;
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer.toString();
    }
}
