package algo.greedy;

import java.util.Arrays;
import java.util.Collections;

// 동전 금액 만들기
public class MakeCoin {
    public static void main(String[] args) {
        System.out.println(solution(28, new int[]{1, 2, 5, 10}));
    }

    static int solution(int totalMoney, int[] coins) {
        coins = Arrays.stream(coins).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int remain = totalMoney;
        int count = 0;

        for (int coin : coins) {
            int coinCount = remain / coin;
            remain %= coin;
            count += coinCount;

            if (remain == 0) break;
        }

        return count;
    }
}
