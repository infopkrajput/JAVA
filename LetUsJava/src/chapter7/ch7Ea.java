// Write a function to calculate the factorial value of any integer entered through the keyboard.
package chapter7;

import java.util.*;;

public class ch7Ea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

    public static int fact(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
