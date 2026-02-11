package algo.implementation;

import java.util.Arrays;

public class PGS_172928_parkWalk {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{"SOO", "OXX", "OOO"},
                new String[]{"E 2", "S 2", "W 1"}
        )));
    }

    static int[] solution(String[] park, String[] routes) {
        int n = park.length;
        int m = park[0].length();
        int x = 0, y = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        int[] dx = {0, 0, 1, -1}; // E W S N
        int[] dy = {1, -1, 0, 0};
        String[] dir = {"E", "W", "S", "N"};

        for (String r : routes) {
            String[] split = r.split(" ");
            String d = split[0];  // 이동방향
            int dist = Integer.parseInt(split[1]);  // 이동거리

            int nx = x;
            int ny = y;
            boolean possible = true;

            int direction = 0;
            for (int i = 0; i < 4; i++) {
                if (dir[i].equals(d)) {
                    direction = i;
                }
            }

            for (int i = 0; i < dist; i++) {
                nx += dx[direction];
                ny += dy[direction];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m || park[nx].charAt(ny) == 'X') {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                x = nx;
                y = ny;
            }
        }


        return new int[]{x, y};
    }
}
