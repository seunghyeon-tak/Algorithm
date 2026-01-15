package algo.implementation;

public class PGS_133499_Babbling {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }

    static int solution(String[] babbling) {
        int answer = 0;
        String[] tokens = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            int pos = 0;
            String prev = "";
            boolean valid = true;

            while (pos < b.length()) {
                boolean matched = false;

                for (String t : tokens) {
                    if (b.startsWith(t, pos)) {
                        if (t.equals(prev)) {
                            valid = false;
                            matched = true;
                            break;
                        }

                        pos += t.length();
                        prev = t;
                        matched = true;
                        break;
                    }
                }

                if (!matched) {
                    valid = false;
                    break;
                }

                if (!valid) {
                    break;
                }
            }
            if (valid) answer++;
        }

        return answer;
    }
}
