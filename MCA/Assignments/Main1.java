import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            byte choice;
            int num1 = 9;
            int num2 = 2;
            while (true) {
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = input.nextByte();
                switch (choice) {
                    case 1:
                        System.out.println("Addition is: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Subtraction is: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Multiplication is: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("Division is: " + (num1 / num2));
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
}