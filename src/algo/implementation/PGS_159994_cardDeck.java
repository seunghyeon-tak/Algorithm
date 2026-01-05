package algo.implementation;

import java.util.*;

public class PGS_159994_cardDeck {
    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"i", "water", "drink"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"})
        );
    }

    static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> qCards1 = new LinkedList<>(List.of(cards1));
        Queue<String> qCards2 = new LinkedList<>(List.of(cards2));

        for (String card : goal) {
            if (!qCards1.isEmpty() && qCards1.peek().equals(card)) {
                qCards1.poll();
            } else if (!qCards2.isEmpty() && qCards2.peek().equals(card)) {
                qCards2.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
