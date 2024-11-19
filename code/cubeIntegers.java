import java.util.Scanner;

public class cubeIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the cube of each number
        int cube1 = num1 * num1 * num1;
        int cube2 = num2 * num2 * num2;

        // Calculate the sum of cubes
        int sum = cube1 + cube2;

        // Display the result
        System.out.println("The sum of cubes of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
