import java.util.Scanner;

public class Q4 {


	
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble(); // Read the number entered by the user

	        // Check if the number is positive, negative, or zero
	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

