package algo.implementation;

import java.util.*;

public class PGS_92334_reportResult {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{"con", "ryan"},
                new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                3
        )));
    }

    static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reportMap = new HashMap<>();  // 신고자 -> 피신고자들
        HashMap<String, Integer> reportedCount = new HashMap<>();
        HashSet<String> stoppedUsers = new HashSet<>();

        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];

            reportMap.computeIfAbsent(reporter, key -> new HashSet<>()).add(reported);
        }

        for (Set<String> set : reportMap.values()) {
            for (String user : set) {
                reportedCount.put(user, reportedCount.getOrDefault(user, 0) + 1);
            }
        }

        for (String user : reportedCount.keySet()) {
            if (k <= reportedCount.get(user)) {
                stoppedUsers.add(user);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            int count = 0;
            Set<String> set = reportMap.get(id_list[i]);

            if (set != null) {
                for (String s : set) {
                    if (stoppedUsers.contains(s)) {
                        count++;
                    }
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}
