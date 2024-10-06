import java.util.*;

@SuppressWarnings({ "resource", "unused" })
public class ch7E_d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the floating point number : ");
        float number1 = sc.nextFloat();
        System.out.print("Enter the Integer number : ");
        int number2 = sc.nextInt();
        float product = calculateProduct(number1, number2);
        System.out.println("The product is: " + product);
    }

    public static float calculateProduct(float num1, int num2) {
        return num1 * num2;
    }
}
