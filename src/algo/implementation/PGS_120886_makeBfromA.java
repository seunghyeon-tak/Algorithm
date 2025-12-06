package algo.implementation;

import java.util.Arrays;

public class PGS_120886_makeBfromA {
    public static void main(String[] args) {
        System.out.println(solution("abc", "cba"));
    }

    static int solution(String before, String after) {
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b) ? 1 : 0;
    }
}
