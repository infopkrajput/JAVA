// Write a program to count the number of occurrences of any two vowels in succession in a line of text. For example, in the sentence "Please read this application and give me gratuity" such occurrences are ea, ea, ui.
package chapter12;

public class ch12Cf {
    static void main() {
        String line = "Please read this application and give me gratuity";
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            if (vowels.indexOf(line.charAt(i)) != -1 && vowels.indexOf(line.charAt(i + 1)) != -1) {
                count++;
            }
        }
        System.out.println("Number of occurrences of two vowels in succession: " + count);

    }
}
