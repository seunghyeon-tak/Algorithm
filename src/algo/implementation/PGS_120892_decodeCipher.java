package algo.implementation;

public class PGS_120892_decodeCipher {
    public static void main(String[] args) {
        System.out.println(solution("pfqallllabwaoclk", 2));
    }

    static String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            answer.append(cipher.charAt(i));
        }

        return answer.toString();
    }
}
