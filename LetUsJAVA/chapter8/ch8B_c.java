
/*
 A 5-digit positive integer is entered through the keyboard, write a recursive function to calculate sum of digits of the 5-digit number.
 */
import java.util.*;

@SuppressWarnings({ "resource", "unused" })
public class ch8B_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3432;
        int s = sum(n);
        System.out.println(s);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }

}
