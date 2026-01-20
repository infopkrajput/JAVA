import java.util.*;
@SuppressWarnings({ "resource", "unused" })
public class ch5Cj {
    public static void main(String[] args) {
        double x, t,sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        x  = sc.nextDouble();
        sum = (x - 1)/x;
        t = (x - 1)/x;
        for(int i = 2;i<=7;i++)
        {
            sum = sum + 0.5 * Math.pow(t,i);
            // System.out.println("sum = " + sum); 
        }
        // System.out.println("Sum of series " + sum);
        System.out.printf("Sum of series = %.2f%n", sum);
    }
}
