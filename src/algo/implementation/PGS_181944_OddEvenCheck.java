package algo.implementation;

import java.util.Scanner;

public class PGS_181944_OddEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0)
            System.out.println(n + " is odd");
        else
            System.out.println(n + " is even");
    }
}
