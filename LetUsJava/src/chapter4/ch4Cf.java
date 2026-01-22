// If the three sides of a triangle are entered through the keyboard, write a program to check whether the triangle is valid or not. The triangle is valid if the sum of two sides is greater than the largest of the three sides.
package chapter4;

import java.util.*;;

public class ch4Cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second side of the triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third side of the triangle : ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                if (a < b + c) {
                    System.out.println("Valid Triangle.");
                } else {
                    System.out.println("Invalid Triangle.");
                }
            } else {
                if (c < a + b) {
                    System.out.println("Valid Triangle.");
                } else {
                    System.out.println("Invalid Triangle.");
                }
            }
        } else {
            if (b > c) {
                if (b < a + c) {
                    System.out.println("Valid Triangle.");
                } else {
                    System.out.println("Invalid Triangle.");
                }
            } else {
                if (c < b + a) {
                    System.out.println("Valid Triangle.");
                } else {
                    System.out.println("Invalid Triangle.");
                }
            }
        }
    }
}
