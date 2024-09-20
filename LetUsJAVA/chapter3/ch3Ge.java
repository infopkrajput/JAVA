package LetUsJAVA.chapter3;

import java.util.Scanner;

public class ch3Ge {
    public static void main(String[] args) {
        int noteOfTen,noteOfFifty,noteOfHundred;
        @SuppressWarnings("resource")
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
