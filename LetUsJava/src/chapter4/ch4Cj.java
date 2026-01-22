// Given a point (x, y), write a program to find out if it lies on the X-axis, Y-axis or on the origin, viz. (0, 0).
package chapter4;

import java.util.*;

public class ch4Cj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x point : ");
        int x = sc.nextInt();
        System.out.print("Enter the y point : ");
        int y = sc.nextInt();
        // int quadrant = (x > 0 && y > 0) ? 1 : ((x < 0 && y > 0) ? 2 : ((x < 0 && y <
        // 0) ? 3 : 4));
        // System.out.println("The point (" + x + ", " + y + ") lies in quadrant " +
        // quadrant);
        if (x == 0 && y == 0) {
            System.out.println("The point lies on the origin.");
        } else if (x != 0 && y == 0) {
            System.out.println("The point lies on x axis.");
        } else if (x == 0) {
            System.out.println("The point lies on y axis.");
        } else {
            System.out.println("The point lies neither on x axis nor y axis.");
        }
    }
}
