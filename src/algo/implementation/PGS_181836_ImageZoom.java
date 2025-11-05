package algo.implementation;

import java.util.Arrays;

public class PGS_181836_ImageZoom {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                solution(new String[]{
                                "x.x",
                                ".x.",
                                "x.x"},
                        3))
        );
    }

    static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            for (int j = 0; j < picture[i].length(); j++) {
                char c = picture[i].charAt(j);
                String chunk = String.valueOf(c).repeat(k);
                rowBuilder.append(chunk);
            }

            String scaleRow = rowBuilder.toString();
            for (int l = 0; l < k; l++) {
                answer[i * k + l] = scaleRow;
            }
        }

        return answer;
    }
}
