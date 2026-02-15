package algo.implementation;

public class PGS_340198_park {
    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{5, 3, 2},
                new String[][]{{"A", "A", "-1", "B", "B", "B", "B", "-1"},
                        {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                        {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                        {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                        {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                        {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}}
        ));
    }

    static int solution(int[] mats, String[][] park) {
        int answer = -1;
        int n = park.length;
        int m = park[0].length;

        for (int size : mats) {
            boolean found = false;

            for (int i = 0; i <= n - size; i++) {
                for (int j = 0; j <= m - size; j++) {
                    boolean possible = true;

                    for (int r = 0; r < size; r++) {
                        for (int c = 0; c < size; c++) {
                            if (!park[i + r][j + c].equals("-1")) {
                                possible = false;
                                break;
                            }
                        }
                        if (!possible) break;
                    }
                    if (possible) {
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (found) {
                answer = Math.max(answer, size);
            }
        }

        return answer;
    }
}
