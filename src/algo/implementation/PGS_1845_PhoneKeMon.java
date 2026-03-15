package algo.implementation;

import java.util.HashSet;

public class PGS_1845_PhoneKeMon {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    static int solution(int[] nums) {
        int n = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        return Math.min(n, set.size());
    }
}
