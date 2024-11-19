import java.util.Scanner;

public class SubtractTwoIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Perform the subtraction
        int result = num1 - num2;

        // Display the result
        System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
