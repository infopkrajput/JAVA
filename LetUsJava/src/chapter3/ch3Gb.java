package LetUsJAVA.chapter3;

import java.util.Scanner;

public class ch3Gb {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int d1 = n%10;
        n/=10;
        int d2 = n%10;
        n/=10;
        int d3 = n%10;
        n/=10;
        int d4 = n%10;
        n/=10;
        int d5 = n%10;
        int sum = d1 + d2 + d3 + d4 + d5;
        System.out.println("Sum of digits: " + sum);
    }
}
