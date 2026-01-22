// A positive integer is entered through the keyboard, write a program to obtain the prime factors of the number using a recursive function.
package chapter8;

import java.util.*;

public class ch8Bd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        if (n == 1) {
            System.out.println("1 has no prime factors.");
            return;
        }

        System.out.print("All prime factors of " + n + " are : ");
        primeFactor(n, 2);
        System.out.println();
    }

    public static void primeFactor(int n, int i) {
        if (n == 1) {
            return;
        }
        // if current divisor squared is greater than n, then n is prime
        if ((long) i * i > n) {
            System.out.print(n + " ");
            return;
        }
        if (n % i == 0) {
            System.out.print(i + " ");
            primeFactor(n / i, i);
        } else {
            primeFactor(n, i + 1);
        }
    }
}
