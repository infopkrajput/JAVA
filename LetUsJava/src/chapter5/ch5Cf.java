// Produce a table of values of i, y and x using i = 2 + (y + 0.5 x), where y varies 1 to 6 and for each y, x varies 5.5 to 12.5 in steps of 0.5.
package chapter5;

public class ch5Cf {
    public static void main(String[] args) {
        float i, y, x;
        for (y = 1; y <= 6; y++) {
            for (x = 5.5f; x <= 12.5; x += 0.5) {
                i = 2 + (y + 0.5f * x);
                System.out.println("Value of i while y : " + y + " And x : " + x + " : " + i);
            }
        }

    }
}
