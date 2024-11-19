import java.util.Scanner;

public class noofdigits {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        int digits = countDigits(number);

        
        System.out.println("The number of digits in " + number + " is: " + digits);
    }

        public static int countDigits(int number) {
        
        if (number == 0) {
            return 1;
        }

        
        int count = 0;

        
        while (number != 0) {
            number /= 10; 
            count++; 
        }

        return count;
    }
}
