import java.util.*;

@SuppressWarnings({ "resource", "unused" })
public class ch8B_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        long bin = binaryUsingRecursion(n);
        System.out.println("Binary : " + bin);
    }

    public static long binaryUsingRecursion(int n) {
        int rem;
        if (n == 0) {
            return 0;
        }
        rem = n % 2;
        return rem + 10 * binaryUsingRecursion(n / 2);
    }

}
