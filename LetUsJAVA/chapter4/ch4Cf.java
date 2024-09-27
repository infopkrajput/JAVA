import java.util.*;;

public class ch4Cf {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second side of the triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third side of the triangle : ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                if (a < b + c) {
                    System.out.println("Valid Triangle.");
                } else {
                    System.out.println("Invalid Triangle.");
                }
            } else {
                if (c < a + b) {
                    System.out.println("Valid Triangle.");
                } else {
                    System.out.println("Invalid Triangle.");
                }
            }
        } else {
            if (b > c) {
                if (b < a + c) {
                    System.out.println("Valid Triangle.");
                } else {
                    System.out.println("Invalid Triangle.");
                }
            } else {
                if (c < b + a) {
                    System.out.println("Valid Triangle.");
                } else {
                    System.out.println("Invalid Triangle.");
                }
            }
        }
    }
}
