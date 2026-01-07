package algo.implementation;

public class PGS_161989_painting {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, new int[]{2, 3, 6}));
    }

    static int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintEnd = 0;

        for (int s : section) {
            if (s > paintEnd) {
                answer++;
                paintEnd = s + m - 1;
            }
        }

        return answer;
    }
}
