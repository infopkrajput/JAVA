import java.util.*;

@SuppressWarnings({ "resource", "unused" })
public class ch8B_g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 25;
        int sum = sumUsingRecursion(n);
        System.out.println(sum);
    }

    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
}
