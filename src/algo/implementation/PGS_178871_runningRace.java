package algo.implementation;

import java.util.Arrays;
import java.util.HashMap;

public class PGS_178871_runningRace {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{"a", "b", "c", "d"},
                new String[]{"b", "c"}
        )));
    }

    static String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String call : callings) {
            int idx = map.get(call);

            if (idx > 0) {
                String frontPlayer = players[idx - 1];
                players[idx - 1] = call;
                players[idx] = frontPlayer;

                map.put(call, idx - 1);
                map.put(frontPlayer, idx);
            }
        }

        return players;
    }
}
