package algo.implementation;

import java.util.*;

public class PGS_138477_hall_of_fame_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }

        static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            rank.sort(Collections.reverseOrder());

            if (rank.size() <= k) {
                answer[i] = rank.get(rank.size() - 1);
            } else {
                answer[i] = rank.get(k - 1);
            }
        }

        return answer;
    }

//    static int[] solution(int k, int[] score) {
//        int[] answer = new int[score.length];
//
//        PriorityQueue<Integer> rank = new PriorityQueue<>();
//
//        for (int i = 0; i < score.length; i++) {
//            rank.add(score[i]);
//
//            if (rank.size() > k) {
//                rank.poll();
//            }
//
//            answer[i] = rank.peek();
//        }
//
//        return answer;
//    }
}
