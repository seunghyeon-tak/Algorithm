package algo.implementation;

public class PGS_12939_maxAndMin {
    public static void main(String[] args) {
        System.out.println(solution("-1 -1"));
    }

    static String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String numStr : s.split(" ")) {
            int val = Integer.parseInt(numStr);
            min = Math.min(min, val);
            max = Math.max(max, val);
        }

        return min + " " + max;
    }
}
