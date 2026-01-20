import java.util.*;

public class ch4Ch {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        int len = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle : ");
        int bth = sc.nextInt();
        int area = len * bth;
        int peri = 2*(len + bth);
        if(area > peri)
        {
            System.out.println("Area of the rectangle is greater than the perimeter of the rectangle.");
        }
        else
        {
            System.out.println("Area of the rectangle is less than or equal to the perimeter of the rectangle.");
        }
    }
}
