
/*
A positive integer is entered through the keyboard, write a program to obtain the prime factors of the number using a recursive function
 */
import java.util.*;

@SuppressWarnings({ "resource", "unused" })
public class ch8B_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("All prime factors of " + n + " are : ");
        primeFactor(n, 2);
    }

    public static void primeFactor(int n, int i) {
        if (n < 0) {
            System.out.println("There are no prime factor of Negative number!.");
        }
        if (n == 1) {
            System.out.println();
        } else if (n % i == 0) {
            System.out.print(i + " ");
            primeFactor(n / i, i);
        } else {
            i++;
            primeFactor(n, i);
        }

    }
}
