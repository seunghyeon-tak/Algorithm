package algo.implementation;

import java.util.Arrays;

public class PGS_12982_Budget {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4}, 9));
    }

    static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int money : d) {
            if (budget < money)
                break;
            budget -= money;
            answer++;
        }

        return answer;
    }
}
