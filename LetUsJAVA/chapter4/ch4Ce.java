import java.util.*;;

public class ch4Ce {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first angle of the triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second angle of the triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third angle of the triangle : ");
        int c = sc.nextInt();
        if (a + b + c == 180) {
            System.out.println("Valid triangle.");
        } else {
            System.out.println("Invalid Triangle.");
        }
    }
}
