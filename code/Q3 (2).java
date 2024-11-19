	import java.util.Scanner;
public class Q3 {



	    public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        
	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        
	        switch (operator) {
	            case '+':
	                System.out.println("Result: " + (num1 + num2));
	                break;
	            case '-':
	                System.out.println("Result: " + (num1 - num2));
	                break;
	            case '*':
	                System.out.println("Result: " + (num1 * num2));
	                break;
	            case '/':
	                if (num2 != 0) {
	                    System.out.println("Result: " + (num1 / num2));
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
	                break;
	        }

	       
	        scanner.close();
	    }
	}

