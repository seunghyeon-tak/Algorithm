package algo.implementation;

public class PGS_140108_splitString {
    public static void main(String[] args) {
        System.out.println(solution("abracadabra"));
    }

    static int solution(String s) {
        int answer = 0;
        int xCount = 0;
        int otherCount = 0;
        char base = 0;

        for (char ch : s.toCharArray()) {
            if (base == 0) {
                base = ch;
            }

            if (ch == base) {
                xCount++;
            } else {
                otherCount++;
            }

            if (xCount == otherCount) {
                answer++;
                xCount = 0;
                otherCount = 0;
                base = 0;
            }
        }

        if (base != 0) {
            answer++;
        }

        return answer;
    }
}
