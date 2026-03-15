package algo.implementation;

import java.util.Arrays;
import java.util.HashSet;

public class PGS_68644_PickTwoAndAdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
    }

    static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(i -> i).toArray();
    }
}
