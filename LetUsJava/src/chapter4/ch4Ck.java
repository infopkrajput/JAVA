// Any year is entered through the keyboard, write a program (using logical operators) to determine whether the year is leap or not.
package chapter4;

import java.util.*;

public class ch4Ck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :  ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }

    }
}