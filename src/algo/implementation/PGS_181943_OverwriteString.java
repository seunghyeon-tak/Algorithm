package algo.implementation;

public class PGS_181943_OverwriteString {
    public static void main(String[] args) {
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }

    static StringBuilder solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        int count = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (i >= s && overwrite_string.length() + s - 1 >= i) {
                if (count == 0) {
                    for (int j = 0; j < overwrite_string.length(); j++) {
                        answer.append(overwrite_string.charAt(j));
                    }
                    count ++;
                }
            } else {
                answer.append(my_string.charAt(i));
            }
        }

        return answer;
    }
}
