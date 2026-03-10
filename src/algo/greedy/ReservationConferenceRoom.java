package algo.greedy;

import java.util.Arrays;

public class ReservationConferenceRoom {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 4}, {2, 3}, {3, 5}, {4, 6}, {5, 7}}));
    }

    static int solution(int[][] rooms) {
        Arrays.sort(rooms, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int count = 0;
        int endTime = 0;

        for (int[] room : rooms) {
            if (room[0] >= endTime) {
                count++;
                endTime = room[1];
            }
        }

        return count;
    }
}
