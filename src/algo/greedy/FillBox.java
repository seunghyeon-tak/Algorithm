package algo.greedy;

// 박스 채우기
public class FillBox {
    public static void main(String[] args) {
        System.out.println(solution(23, new int[]{5, 3, 1}));
    }

    static int solution(int n, int[] boxs) {
        int count = 0;
        int remaining = n;

        for (int box : boxs) {
            int boxCount = remaining / box;
            count += boxCount;
            remaining %= box;

            if (remaining == 0) break;
        }

        return count;
    }
}
