package algo.implementation;

public class PGS_155652_secretBetweenTwo {
    public static void main(String[] args) {
        System.out.println(solution("aukks", "wbqd", 5));
    }

    static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char sChar : s.toCharArray()) {
            char current = sChar;
            int count = 0;

            while (count < index) {
                current += 1;

                if (current > 'z') current = 'a';
                if (skip.indexOf(current) != -1) continue;

                count++;
            }
            answer.append(current);
        }

        return String.valueOf(answer);
    }
}
