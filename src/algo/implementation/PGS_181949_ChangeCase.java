package algo.implementation;

import java.util.Scanner;

public class PGS_181949_ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] ca = s.toCharArray();
        StringBuilder answer = new StringBuilder();

        for (char c : ca) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }
        }

        System.out.println(answer);
    }
}
