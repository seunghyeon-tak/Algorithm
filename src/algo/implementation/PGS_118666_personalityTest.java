package algo.implementation;

import java.util.HashMap;
import java.util.Map;

public class PGS_118666_personalityTest {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}));
    }

    static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : "RTCFJMAN".toCharArray()) {
            map.put(c, 0);
        }

        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == 4) continue;

            char targetType = (choices[i] < 4) ? survey[i].charAt(0) : survey[i].charAt(1);

            int score = switch (choices[i]) {
                case 1, 7 -> 3;
                case 2, 6 -> 2;
                case 3, 5 -> 1;
                default -> 0;
            };

            map.put(targetType, map.getOrDefault(targetType, 0) + score);
        }

        char[][] pointer = new char[][]{{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        for (char[] c : pointer) {
            char leftKey = c[0];
            char rightKey = c[1];

            int leftValue = map.getOrDefault(leftKey, 0);
            int rightValue = map.getOrDefault(rightKey, 0);

            if (leftValue > rightValue) answer.append(leftKey);
            else if (leftValue < rightValue) answer.append(rightKey);
            else answer.append(leftKey < rightKey ? leftKey : rightKey);
        }

        return String.valueOf(answer);
    }
}
