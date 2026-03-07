package algo.greedy;

import java.util.Arrays;

// 트럭 배송
public class TruckDelivery {
    public static void main(String[] args) {
        System.out.println(solution(7, 2, new int[]{2, 3, 4, 5, 6}));
    }

    static int solution(int weight, int maxBoxs, int[] boxs) {
        Arrays.sort(boxs);

        int left = 0;
        int right = boxs.length - 1;
        int truck = 0;

        while (left <= right) {
            if (boxs[left] + boxs[right] <= weight) {
                left++;
            }
            right--;
            truck++;
        }

        return truck;
    }
}
