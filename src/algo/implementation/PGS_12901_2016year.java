package algo.implementation;

public class PGS_12901_2016year {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }

    static String solution(int a, int b) {
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = b - 1;

        for (int i = 0; i < a - 1; i++) {
            totalDay += days[i];
        }

        return week[(totalDay % 7)];
    }
}
