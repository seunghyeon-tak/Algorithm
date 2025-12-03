package algo.implementation;

import java.util.LinkedHashSet;
import java.util.Set;

public class PGS_120888_deduplicateString {
    public static void main(String[] args) {
        System.out.println(solution("We are the world"));
    }

    static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for (char c : my_string.toCharArray()) {
            if (set.add(c)) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
