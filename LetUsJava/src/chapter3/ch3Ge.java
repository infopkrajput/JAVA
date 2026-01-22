// In a town, the percentage of man is 52. the percentage of total literacy is 48. if the percentage of literate man is 35 of the total population. write a program to find the total number of illiterate men and women if the population of the town is 80000.
package chapter3;

import java.util.Scanner;

public class ch3Ge {
    public static void main(String[] args) {
        int noteOfTen, noteOfFifty, noteOfHundred;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount to withdraw : ");
        int amount = sc.nextInt();
        noteOfHundred = amount / 100;
        amount = amount % 100;
        noteOfFifty = amount / 50;
        amount = amount % 50;
        noteOfTen = amount / 10;
        System.out.println("Number of 100 notes : " + noteOfHundred);
        System.out.println("Number of 50 notes : " + noteOfFifty);
        System.out.println("Number of 10 notes : " + noteOfTen);
    }
}
