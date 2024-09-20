package LetUsJAVA.chapter3;
import java.util.Scanner;

/**
 * ch3Ga
 */
public class ch3Ga {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int C,D;
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