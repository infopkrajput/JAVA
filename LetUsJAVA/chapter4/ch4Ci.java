import java.util.*;
import java.lang.Math;

public class ch4Ci {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, r;
        double pc;
        System.out.print("Enter the center co-ordinates of the circle = ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("Enter the radius of the circle = ");
        r = sc.nextInt();
        System.out.print("Enter the point of co-ordinates ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        // formula for check distance between point and center point of circle
        pc = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (pc == 0)
        System.out.println("point (" + x2 + "," + y2 + ") on the boundary of circle.");
        else if (pc > r)
        System.out.println("point (" + x2 + "," + y2 + ") outside of the circle.");
        else if (pc < r)
        System.out.println("point (" + x2 + "," + y2 + ") inside the circle.");
        else
        System.out.println("Wrong Entry");
    }
}
