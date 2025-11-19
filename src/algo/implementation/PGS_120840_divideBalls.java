package algo.implementation;

public class PGS_120840_divideBalls {
    public static void main(String[] args) {
        System.out.println(solution(15, 5));
    }

    static int solution(int balls, int share) {
        if (share < 0 || share > balls)
            return 0;
        if (share == 0 || share == balls)
            return 1;

        int r = Math.min(share, balls - share);
        long res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (balls - i + 1) / i;
        }

        return (int) res;
    }
}
