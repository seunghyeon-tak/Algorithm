package algo.implementation;

import java.util.Arrays;

public class PGS_42885_Lifeboat {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{70, 50, 80, 50}, 100));
    }

    static int solution(int[] people, int limit) {
        int answer = 0;
        int left = 0;
        int right = people.length - 1;

        Arrays.sort(people);

        while (left <= right) {
            if (people[left] + people[right] <= limit)
                left++;

            right--;
            answer++;
        }

        return answer;
    }
}
