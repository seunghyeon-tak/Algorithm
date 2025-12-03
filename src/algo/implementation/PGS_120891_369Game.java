package algo.implementation;

public class PGS_120891_369Game {
    public static void main(String[] args) {
        System.out.println(solution(29423));
    }

    static int solution(int order) {
        int answer = 0;

        String strNumber = String.valueOf(order);

        for (char c : strNumber.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }

        return answer;
    }
}
