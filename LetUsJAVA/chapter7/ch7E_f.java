import java.math.BigDecimal;
import java.util.*;

@SuppressWarnings({ "resource", "unused" })
public class ch7E_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = 5;
        float number2 = 3.5f;
        double number3 = 2.7;
        BigDecimal result = fun(number1, number2, number3);
        System.out.println("The result is: " + result);

    }

    public static BigDecimal fun(int num1, float num2, double num3) {
        BigDecimal result = BigDecimal.valueOf(num1)
                .multiply(BigDecimal.valueOf(num2))
                .multiply(BigDecimal.valueOf(num3));
        return result;
    }
}