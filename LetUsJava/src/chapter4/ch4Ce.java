// Write a program to check whether a triangle is valid or not, when the three angles of the triangle are entered through the keyboard. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
package chapter4;

import java.util.*;;

public class ch4Ce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first angle of the triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second angle of the triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third angle of the triangle : ");
        int c = sc.nextInt();
        if (a + b + c == 180) {
            System.out.println("Valid triangle.");
        } else {
            System.out.println("Invalid Triangle.");
        }
    }
}
