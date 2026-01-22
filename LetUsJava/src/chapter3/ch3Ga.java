// Two Numbers are input through the keyboard into two local variables C and D. Write a java program to interchange the contents of C and D.
package chapter3;

import java.util.Scanner;

public class ch3Ga {
    public static void main(String[] args) {
        int C, D;
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        D = sc.nextInt();
        System.out.println("Value of C before swapping: " + C);
        System.out.println("Value of D before swapping: " + D);
        int t = C;
        C = D;
        D = t;
        System.out.println("Value of C after swapping: " + C);
        System.out.println("Value of D after swapping: " + D);
    }
}