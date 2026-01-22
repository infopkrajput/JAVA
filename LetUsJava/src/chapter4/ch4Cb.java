// Any integer is input through the keyboard. Write a program to find out whether it is an odd number or even number.
package chapter4;

import java.util.*;

public class ch4Cb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Given Number is even.");
        } else {
            System.out.println("Given Number is odd.");
        }
    }
}
