// Write a program to find the absolute value of a number that is entered through the keyboard.
package chapter4;

import java.util.*;

public class ch4Cc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("Absolute Number is " + n);
        } else {
            System.out.println("Absolute Number is " + n * -1);
        }
    }
}
