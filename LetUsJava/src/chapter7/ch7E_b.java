import java.util.*;;

@SuppressWarnings({ "resource", "unused" })
public class ch7E_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        int c = power(a, b);
        System.out.println("Power of " + a + " To " + b + " is " + c);
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;

    }
}
