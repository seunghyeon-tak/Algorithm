package algo.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PGS_176963_memoryScore {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{
                        {"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}
                }
        )));
    }

    static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int answerIdx = 0;
        Map<String, Integer> mapName = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            mapName.put(name[i], yearning[i]);
        }

        for (String[] ps : photo) {
            int scoreSum = 0;
            for (String p : ps) {
                if (mapName.containsKey(p)) {
                    scoreSum += mapName.getOrDefault(p, 0);
                }
            }
            answer[answerIdx++] = scoreSum;
        }

        return answer;
    }
}
