package algo.implementation;

import java.util.Arrays;
import java.util.HashMap;

public class PGS_160586_roughKeyboard {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"AA"}, new String[]{"B"})));
    }

    static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for (String k : keymap) {
            for (int i = 0; i < k.length(); i++) {
                char ch = k.charAt(i);
                int press = i + 1;
                map.put(ch, Math.min(map.getOrDefault(ch, Integer.MAX_VALUE), press));
            }
        }

        for (int j = 0; j < targets.length; j++) {
            int count = 0;
            for (int i = 0; i < targets[j].length(); i++) {
                char ch = targets[j].charAt(i);

                if (!map.containsKey(ch)) {
                    count = -1;
                    break;
                }
                count += map.get(targets[j].charAt(i));
            }
            answer[j] = count;
        }

        return answer;
    }
}
