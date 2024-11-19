import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println("The character is a consonant.");
        } else {
            System.out.println("Error: The character is not a letter.");
        }

       
        scanner.close();
    }
}
