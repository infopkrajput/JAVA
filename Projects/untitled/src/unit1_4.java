import java.util.Scanner;

public class unit1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder revStr = new StringBuilder();
        boolean check = true;

        // Reverse the string using a loop
        for (int i = str.length() - 1; i >= 0; i--) {
            //revStr = revStr + str.charAt(i);
            revStr.append(str.charAt(i));
        }

        // Check if the string is a palindrome
        for (int i = 0; i < str.length(); i++) {
            if (revStr.charAt(i) != str.charAt(i)) {
                check = false;
                break;
            }
        }

        // Print the result
        if (check) {
            System.out.println("This string is a palindrome.");
        } else {
            System.out.println("This string is not a palindrome.");
        }
    }
}
