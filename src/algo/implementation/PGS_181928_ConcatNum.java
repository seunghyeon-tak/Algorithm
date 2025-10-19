package algo.implementation;

// 이어 붙인 수
public class PGS_181928_ConcatNum {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3 ,5}));
    }

    static int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int j : num_list) {
            if (j % 2 != 0) {
                odd.append(j);
            } else {
                even.append(j);
            }
        }

        // 0 처리
        String oddStr = odd.isEmpty() ? "0" : odd.toString();
        String evenStr = even.isEmpty() ? "0" : even.toString();

        int oddNum = Integer.parseInt(oddStr);
        int evenNum = Integer.parseInt(evenStr);

        return oddNum + evenNum;
    }
}
