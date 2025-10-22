package algo.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PGS_181921_ArrayCreate2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 555)));
    }

    static int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean ok = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c != '0' && c != '5') {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
