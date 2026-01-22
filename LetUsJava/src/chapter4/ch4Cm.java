// Using conditional operators determine
// (1) Whether the character entered through the keyboard is a lower case alphabet or not.
// (2) Whether a character entered through the keyboard is a special symbol or not.
// (3) Whether a character entered through the keyboard is a digit or not.
// (4) Whether a character entered through the keyboard is alphanumeric or not.
package chapter4;

import java.util.*;

public class ch4Cm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String result = (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Uppercase";
        System.out.println(result);
    }
}
