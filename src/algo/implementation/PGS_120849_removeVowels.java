package algo.implementation;

public class PGS_120849_removeVowels {
    public static void main(String[] args) {
        System.out.println(solution("nice to meet you"));
    }

    static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char c : my_string.toCharArray()) {
            boolean isVo = false;
            for (char v : vowels) {
                if (c == v) {
                    isVo = true;
                    break;
                }
            }
            if (!isVo)
                answer.append(c);
        }

        return answer.toString();
    }
}
