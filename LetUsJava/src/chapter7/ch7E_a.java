import java.util.*;;

@SuppressWarnings({ "resource", "unused" })
public class ch7E_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

    public static int fact(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
