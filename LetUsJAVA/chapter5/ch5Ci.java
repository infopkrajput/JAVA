import java.util.*;
@SuppressWarnings({ "resource", "unused" })
public class ch5Ci {
    public static void main(String[] args) {
        double fact,sum = 0.0;

        for(int i = 1;i<=7;i++)
        {
            fact = 1;
            for(int j = 1;j<=i;j++)
            {
                fact = fact * j;
            }
            sum = sum + i/fact;
            // System.out.println("sum = " + sum);
        }
        // System.out.println("Sum of series " + sum);
        System.out.printf("Sum of series = %.2f%n", sum);
    }
}
