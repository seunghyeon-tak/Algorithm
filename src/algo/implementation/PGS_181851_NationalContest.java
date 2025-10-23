package algo.implementation;

import java.util.*;

public class PGS_181851_NationalContest {
    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{3, 7, 2, 5, 4, 6, 1},
                new boolean[]{false, true, true, true, true, false, false})
        );
    }

    static int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], i);
        }

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(rank[i]);
            }
        }

        Collections.sort(list);

        int[] answer = new int[3];
        for (int i = 0; i < 3; i++) {
            answer[i] = map.get(list.get(i));
        }

        return 10000 * answer[0] + 100 * answer[1] + answer[2];
    }
}
