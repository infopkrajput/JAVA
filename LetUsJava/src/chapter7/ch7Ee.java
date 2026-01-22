// If the lengths of the sides of a triangle are denoted by a, b, and c, then area of triangle is given by
// area = √( S ( S − a ) ( S − b ) ( S − c ) )
// where, S = ( a + b + c ) / 2
package chapter7;

import java.util.*;

public class ch7Ee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side a : ");
        int a = sc.nextInt();
        System.out.print("Enter the side b : ");
        int b = sc.nextInt();
        System.out.print("Enter the side c : ");
        int c = sc.nextInt();

        if (!isValidTriangle(a, b, c)) {
            System.out.println("Invalid triangle sides. Sum of any two sides must be greater than the third.");
            return;
        }

        double area = getArea(a, b, c);
        System.out.println("Area of triangle is " + area);
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double getArea(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
