// Twenty-five numbers are entered from the keyboard into an array. Write a program to find out how many of them are positive, how many are negative, how many are even and how many odd.
package chapter11;

import java.util.Scanner;

public class ch11Bb {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[25];
        int positiveCount = 0;
        int negativeCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        System.out.print("Enter 25 numbers: ");
        for(int i = 0; i < 25; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int num : numbers) {
            if(num > 0) positiveCount++;
            else if(num < 0) negativeCount++;
            if(num % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        sc.close();
    }
}
