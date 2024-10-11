import java.util.*;

@SuppressWarnings({ "resource", "unused" })
public class ch8B_h {
    public static void main(String[] args) {
        int a = 5, b = 4, res;
        res = fun(a, b);
        System.out.println(res);
        res = fun(1, 5, a, b, 7, 99, 100);
        System.out.println(res);
    }

    public static int fun(int... x) {
        int big = Integer.MIN_VALUE;
        for (int i : x) {
            if (i > big) {
                big = i;
            }
        }
        return big;
    }
}
