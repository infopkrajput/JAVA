// Any year is entered through the keyboard. Write a function to determine whether the year is a leap year or not.
package chapter7;

import java.util.*;

public class ch7Ec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        boolean leap = check(year);
        if (leap) {
            System.out.println("Leap Year!");
        } else {
            System.out.println("Not a leap year!");
        }
    }

    public static boolean check(int year) {
        return (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) ? true : false;
    }
}
