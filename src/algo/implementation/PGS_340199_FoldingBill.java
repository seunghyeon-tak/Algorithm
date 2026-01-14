package algo.implementation;

public class PGS_340199_FoldingBill {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{50, 50}, new int[]{100, 241}));
    }

    static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int walletBigValue = Math.max(wallet[0], wallet[1]);
        int walletSmallValue = Math.min(wallet[0], wallet[1]);

        int billBigValue = Math.max(bill[0], bill[1]);
        int billSmallValue = Math.min(bill[0], bill[1]);

        while (billBigValue > walletBigValue || billSmallValue > walletSmallValue) {
            billBigValue /= 2;
            answer++;

            if (billBigValue < billSmallValue) {
                int tmp = billBigValue;
                billBigValue = billSmallValue;
                billSmallValue = tmp;
            }
        }

        return answer;
    }
}
