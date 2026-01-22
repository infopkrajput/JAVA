// If a function fun() is to receive an int, a float & a double, and it is to return a decimal then how will you define this function?
package chapter7;

import java.math.BigDecimal;

public class ch7Ef {
    public static void main(String[] args) {
        int number1 = 5;
        float number2 = 3.5f;
        double number3 = 2.7;
        BigDecimal result = fun(number1, number2, number3);
        System.out.println("The result is: " + result);

    }

    public static BigDecimal fun(int num1, float num2, double num3) {
        return BigDecimal.valueOf(num1).multiply(BigDecimal.valueOf(num2)).multiply(BigDecimal.valueOf(num3));
    }
}