package algo.implementation;

public class PGS_120889_triangleCompletion1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
    }

    static int solution(int[] sides) {
        int sum = 0;
        int max = 0;

        for (int i : sides) {
            sum += i;
            if (max < i) {
                max = i;
            }
        }

        return (sum - max) > max ? 1 : 2;
    }
}
