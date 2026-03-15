package algo.implementation;

import java.util.Arrays;

public class PGS_12915_SortStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n))
                return a.compareTo(b);
            return a.charAt(n) - b.charAt(n);
        });

        return strings;
    }
}
