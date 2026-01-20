import java.util.*;

@SuppressWarnings({ "resource", "unused" })
public class ch7E_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side a : ");
        int a = sc.nextInt();
        System.out.print("Enter the side b : ");
        int b = sc.nextInt();
        System.out.print("Enter the side c : ");
        int c = sc.nextInt();
        float area = getArea(a, b, c);
        System.out.println("Area of triangle is " + area);
    }

    public static float getArea(int a, int b, int c) {
        float area;
        float s = (float) (a + b + c) / 2;
        area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
