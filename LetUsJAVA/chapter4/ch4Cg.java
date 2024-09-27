import java.util.*;;

public class ch4Cg {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second side of the triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third side of the triangle : ");
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle.");
        } else {
            System.out.println("Scalene Triangle.");
        }
        if (a == Math.sqrt(b * b + c * c) || b == Math.sqrt(c * c + a * a) || c == Math.sqrt(b * b + a * a)) {
            System.out.println("Right-angled Triangle.");
        }
    }
}
