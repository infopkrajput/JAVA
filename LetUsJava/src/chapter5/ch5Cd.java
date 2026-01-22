// Write a program to print all prime numbers from 1 to 300. (Hint: Use nested loops, break and continue).
package chapter5;

import java.util.*;

public class ch5Cd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime;
        System.out.print("All prime numbers between 1 and 300 are: ");
        for (int i = 2; i <= 300; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
