// Define an overloaded max() function which returns maximum out of two integers / floats / doubles.
package chapter8;

import java.util.*;

public class ch8Ba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1, i2, i3;
        float f1, f2, f3;
        double d1, d2, d3;
        System.out.print("Enter the int 1 : ");
        i1 = sc.nextInt();
        System.out.print("Enter the int 2 : ");
        i2 = sc.nextInt();
        i3 = max(i1, i2);
        System.out.println("Maximum in " + i1 + " and " + i2 + " is " + i3);

        System.out.print("Enter the float 1 : ");
        f1 = sc.nextFloat();
        System.out.print("Enter the float 2 : ");
        f2 = sc.nextFloat();
        f3 = max(f1, f2);
        System.out.println("Maximum in " + f1 + " and " + f2 + " is " + f3);

        System.out.print("Enter the Double 1 : ");
        d1 = sc.nextDouble();
        System.out.print("Enter the Double 2 : ");
        d2 = sc.nextDouble();
        d3 = max(d1, d2);
        System.out.println("Maximum in " + d1 + " and " + d2 + " is " + d3);

    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static float max(float a, float b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

}