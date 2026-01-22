// Write a menu-driven program which has the following options:
// 1. Factorial of a number
// 2. Prime or not
// 3. Odd or even
// 4. Exit
// Once a menu item is selected the appropriate action should be taken and once this action is finished, the menu should reappear. Unless the user selects the ‘Exit’ option the program should continue to work.
//(Hint: Make use of an infinite while and a switch statement).

package chapter6;

import java.util.*;

public class ch6Ca {
    public static void main(String[] args) {
        boolean exit = true;
        while (exit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Factorial of a number : ");
            System.out.println("2. Prime or not : ");
            System.out.println("3. Odd or Even : ");
            System.out.println("4. Exit ");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter any number to calculate factorial : ");
                    int x = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= x; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial of " + x + " is " + fact);
                    break;
                case 2:
                    System.out.print("Enter any number to check if it is prime : ");
                    int num = sc.nextInt();
                    boolean isPrime = true;
                    for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                            System.out.println(num + " is not a prime number.");
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(num + " is a prime number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter any number to check if it is odd or even : ");
                    int n = sc.nextInt();
                    if (n % 2 == 0) {
                        System.out.println(n + " is an even number.");
                    } else {
                        System.out.println(n + " is an odd number.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    exit = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
