package algo.implementation;

public class PGS_134240_foodFight {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 6}));
    }

    static String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;

            for (int n = 0; n < count; n++) {
                answer.append(i);
            }
        }

        return answer.toString() + "0" + answer.reverse().toString();
    }
}
