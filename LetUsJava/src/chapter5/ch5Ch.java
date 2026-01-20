import java.util.*;
@SuppressWarnings({ "resource", "unused" })
public class ch5Ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sets = 10;
        double p, r, n, q, a;
        for (int i = 0; i < sets; i++) {
            System.out.print("Enter principal : ");
            p = sc.nextDouble();
            System.out.print("Enter annual interest rate : ");
            r = sc.nextDouble();
            System.out.print("Enter number of years : ");
            n = sc.nextDouble();
            System.out.print("Enter compounding frequency : ");
            q = sc.nextDouble();
            r = r / 100;
            a = p * Math.pow((1 + r / n), n * q);
            System.out.println("Amount : " + a);
        }

    }
    
}
