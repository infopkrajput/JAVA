// Write a program to print the multiplication table of the number entered by the user.
package chapter5;

import java.util.*;

public class ch5Cg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        System.out.println("Table of given number : ");
        for (int i = 1; i <= 10; i++) {
            // System.out.printf("%d * %d = %d%n", x, i, x*i);
            System.out.println(x + " * " + i + " = " + i * x);
        }
    }

}
