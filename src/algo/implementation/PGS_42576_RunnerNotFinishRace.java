package algo.implementation;

import java.util.HashMap;

public class PGS_42576_RunnerNotFinishRace {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
//        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"kiki", "eden"}));
    }

    static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) >= 1) answer = s;
        }

        return answer;
    }
}
