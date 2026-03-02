package algo.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PGS_138476_TangerineSelection {
    public static void main(String[] args) {
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }

    static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());

        list.sort((a, b) -> b - a);

        int sum = 0;
        for (int i : list) {
            sum += i;
            answer++;

            if (sum >= k) {
                break;
            }
        }

        return answer;
    }
}
