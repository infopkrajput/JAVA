import java.util.Scanner;

public class digitsfactorial {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        calculateAndPrintDigitFactorials(number);
    }

    
    public static void calculateAndPrintDigitFactorials(int number) {
       
        if (number == 0) {
            System.out.println("Factorial of 0 is 1");
            return;
        }

        
        while (number != 0) {
            int digit = number % 10; 
            int factorial = calculateFactorial(digit); 
            System.out.println("Factorial of " + digit + " is " + factorial);
            number /= 10; 
        }
    }

    // Function to calculate the factorial of a given number
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
