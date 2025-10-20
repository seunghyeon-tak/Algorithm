package algo.implementation;

public class PGS_181940_StrRepeat {
    public static void main(String[] args) {
        System.out.println(solution("love", 10));
    }

    static String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < k; i++) {
            answer.append(my_string);
        }

        return answer.toString();
    }
}
