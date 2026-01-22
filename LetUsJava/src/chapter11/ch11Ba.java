// Twenty-five numbers are entered from the keyboard into an array. The number to be searched is entered through the keyboard by the user. Write a program to find if the number to be searched is present in the array and if it is present, display the number of times it appears in the array.
package chapter11;

import java.util.Scanner;

public class ch11Ba {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[25];
        System.out.print("Enter 25 numbers: ");
        for (int i = 0; i < 25; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int searchNumber = sc.nextInt();
        int count = 0;
        for (int num : numbers) {
            if (num == searchNumber) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("The number " + searchNumber + " is present in the array and appears " + count + " times.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }
        sc.close();
    }
}
