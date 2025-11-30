package algo.implementation;

public class PGS_120895_indexChange {
    public static void main(String[] args) {
        System.out.println(solution("I love you", 3, 6));
    }

    static String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        char num1Char = my_string.charAt(num1);
        char num2Char = my_string.charAt(num2);

        for (int i = 0; i < my_string.length(); i++) {
            if (num1 == i) {
                answer.append(num2Char);
            } else if (num2 == i) {
                answer.append(num1Char);
            } else {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
}
