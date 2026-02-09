package algo.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PGS_150370_privacyExpiration {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                "2020.01.01",
                new String[]{"Z 3", "D 5"},
                new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}))
        );
    }

    static int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (String term : terms) {
            String[] split = term.split(" ");
            map.put(split[0], Integer.parseInt(split[1]));
        }

        int todayDays = toDays(today);

        int index = 1;
        for (String privacy : privacies) {
            String[] split = privacy.split(" ");
            String date = split[0];
            String type = split[1];

            int collectedDays = toDays(date);
            int expiredDays = collectedDays + map.get(type) * 28 - 1;

            if (expiredDays < todayDays) {
                list.add(index);
            }
            index++;
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    static int toDays(String date) {
        String[] split = date.split("\\.");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        return year * 12 * 28 + (month - 1) * 28 + day;
    }
}
