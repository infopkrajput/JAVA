import java.util.Scanner;
public class Q2 {
	
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	   
	        System.out.print("Enter your exam score: ");
	        int score = scanner.nextInt();

	     
	        if (score >= 90 && score <= 100) {
	            System.out.println("Your grade is A");
	        } else if (score >= 80 && score <= 89) {
	            System.out.println("Your grade is B");
	        } else if (score >= 70 && score <= 79) {
	            System.out.println("Your grade is C");
	        } else if (score >= 60 && score <= 69) {
	            System.out.println("Your grade is D");
	        } else if (score >= 0 && score < 60) {
	            System.out.println("Your grade is F");
	        } else {
	           
	            System.out.println("Error: Invalid score. Please enter a number between 0 and 100.");
	        }

	      
	        scanner.close();
	    }
	}
