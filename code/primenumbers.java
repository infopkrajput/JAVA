import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of prime numbers to generate: ");
        int n = scanner.nextInt();

       
        generatePrimes(n);
    }

    
    public static void generatePrimes(int n) {
        int count = 0; 
        int num = 2; 

      
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
