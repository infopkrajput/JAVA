// Write a program to print out all Armstrong numbers between 1 and 500.
package chapter5;

import java.util.*;

public class ch5Cc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int armstrongNum = 0, num, temp, remainder;
        for (int i = 100; i <= 500; i++) {
            num = i;
            temp = num;
            armstrongNum = 0;
            // Calculate sum of cube of digits of given number
            while (temp != 0) {
                remainder = temp % 10;
                armstrongNum += (int) Math.pow(remainder, 3);
                temp /= 10;
            }
            // Print Armstrong numbers between 100 and 500
            if (armstrongNum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
