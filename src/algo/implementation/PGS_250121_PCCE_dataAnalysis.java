package algo.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PGS_250121_PCCE_dataAnalysis {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(
                        new int[][]{{1, 20300104, 100, 60}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}},
                        "date",
                        20300501,
                        "remain"
                ))
        );
    }

    static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();

        int extIndex = getIndex(ext);
        int sortIndex = getIndex(sort_by);

        for (int[] row : data) {
            if (row[extIndex] <= val_ext) {
                list.add(row);
            }
        }

        int[][] answer = list.toArray(new int[0][]);

        Arrays.sort(answer, Comparator.comparingInt(a -> a[sortIndex]));

        return answer;
    }

    static int getIndex(String key) {
        return switch (key) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };
    }
}
