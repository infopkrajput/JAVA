import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the rate of interest
        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the time period in years
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the simple interest
        System.out.println("Simple interest for the amount " + principal + " at the rate of " + rate +
                "% for " + time + " years is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}

