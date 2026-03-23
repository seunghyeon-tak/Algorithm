package algo.implementation;

public class PGS_12926_CaesarPassword {
    public static void main(String[] args) {
        System.out.println(solution("W B z", 4));
    }

    static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(" ");
            } else if (c >= 'A' && c <= 'Z') {
                answer.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else if (c >= 'a' && c <= 'z') {
                answer.append((char) ((c - 'a' + n) % 26 + 'a'));
            }
        }

        return answer.toString();
    }
}
