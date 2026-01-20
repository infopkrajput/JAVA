import java.util.*;

@SuppressWarnings({ "resource", "unused" })
public class ch8B_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
