import java.util.Scanner;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        // Check if the denominator is zero
        if (denominator != 0) {
            // Perform the division
            int result = numerator / denominator;
            // Display the result
            System.out.println("The result of dividing " + numerator + " by " + denominator + " is: " + result);
        scanner.close();
        }
    }
}
