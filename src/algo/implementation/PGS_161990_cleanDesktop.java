package algo.implementation;

import java.util.Arrays;

public class PGS_161990_cleanDesktop {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                        solution(new String[]{
                                "..........", ".....#....", "......##..", "...##.....", "....#....."})
                )
        );
    }

    static int[] solution(String[] wallpaper) {
        int sx = Integer.MAX_VALUE;
        int ex = Integer.MIN_VALUE;
        int sy = Integer.MAX_VALUE;
        int ey = Integer.MIN_VALUE;

        for (int j = 0; j < wallpaper.length; j++) {
            for (int i = 0; i < wallpaper[j].length(); i++) {
                if (wallpaper[j].charAt(i) == '#') {
                    sx = Math.min(sx, j);
                    ex = Math.max(ex, j);
                    sy = Math.min(sy, i);
                    ey = Math.max(ey, i);
                }
            }
        }

        return new int[]{sx, sy, ex + 1, ey + 1};
    }
}
