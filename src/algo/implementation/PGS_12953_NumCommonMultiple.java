package algo.implementation;

public class PGS_12953_NumCommonMultiple {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 6, 8, 14}));
    }

    static int solution(int[] arr) {
        int answer = 1;
        int numDivide = 2;

        while (!allOne(arr)) {
            boolean divide = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % numDivide == 0) {
                    arr[i] /= numDivide;
                    divide = true;
                }
            }

            if (divide) {
                answer *= numDivide;
            } else {
                numDivide++;
            }

        }

        return answer;
    }

    static boolean allOne(int[] arr) {
        for (int num : arr) {
            if (num != 1) {
                return false;
            }
        }
        return true;
    }
}
