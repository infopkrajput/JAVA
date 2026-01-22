// Write a program to find the factorial value of any number entered through the keyboard.
package chapter5;

import java.util.*;

public class ch5Ca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
