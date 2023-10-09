package org.example;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        pattern(x);
        scanner.close();
    }

    public static void pattern(int x) {
        if (x < 1) {
            System.out.println("Invalid input");
        } else {

            if (x % 2 == 0) {
                x--;
            }

            System.out.print("Output: ");
            for (int i = 1; i <= x; i ++) {
                int odd=2 * i - 1;
                System.out.print(odd + "  ");

            }
        }
    }
}
