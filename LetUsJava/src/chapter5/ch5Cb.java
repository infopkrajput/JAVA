// Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
package chapter5;

import java.util.*;

public class ch5Cb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println("The product of " + a + " and " + b + " is " + ans);

    }
}
