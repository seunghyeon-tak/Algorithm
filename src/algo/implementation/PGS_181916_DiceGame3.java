package algo.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PGS_181916_DiceGame3 {
    public static void main(String[] args) {
        System.out.println(solution(6, 4, 2, 5));
    }

    static int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] dice = {a, b, c, d};

        for (int num : dice) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int size = map.size();

        if (size == 1) {
            int p = map.keySet().iterator().next();
            return 1111 * p;
        } else if (size == 2) {
            ArrayList<Integer> keys = new ArrayList<>(map.keySet());
            Integer p = keys.get(0);
            Integer q = keys.get(1);

            if (map.get(p) == 3) {
                int v = 10 * p + q;
                return v * v;
            } else if (map.get(q) == 3) {
                int v = 10 * q + p;
                return v * v;
            } else {
                return (p + q) * Math.abs(p - q);
            }
        } else if (size == 3) {
            int product = 1;

            for (int i : map.keySet()) {
                if (map.get(i) != 2) {
                    product *= i;
                }
            }
            return product;
        } else {
            int current = 10;

            for (int i : map.keySet()) {
                if (current > i) {
                    current = i;
                }
            }

            return current;
        }
    }
}
