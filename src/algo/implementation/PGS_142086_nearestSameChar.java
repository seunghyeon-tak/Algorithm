package algo.implementation;

import java.util.Arrays;
import java.util.HashMap;

public class PGS_142086_nearestSameChar {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
    }

    static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int res = i - map.get(s.charAt(i));
                answer[i] = res;
            } else {
                answer[i] = -1;
            }
            map.put(s.charAt(i), i);
        }


        return answer;
    }
}
