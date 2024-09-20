package LetUsJAVA.chapter3;

import java.util.Scanner;

public class ch3Gc {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter the five digit number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev,d1,d2,d3,d4,d5;
        d1 = num%10;
        num /=10;
        d2 = num % 10;
        num /=10;
        d3 = num % 10;
        num /=10;
        d4 = num % 10;
        num /=10;
        d5 = num % 10;
        rev = d1*10000 + d2*1000 + d3*100 + d4*10 + d5;
        System.out.println("Reversed " + rev);

    }
}
