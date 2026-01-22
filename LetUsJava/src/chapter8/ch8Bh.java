// Write the function fun( ) which finds the minimum number from the variable arguments list passed to it.

package chapter8;

public class ch8Bh {
    public static void main(String[] args) {
        int a = 5, b = 4, res;
        res = fun(a, b);
        System.out.println(res);
        res = fun(1, 5, a, b, 7, 99, 100);
        System.out.println(res);
    }

    public static int fun(int... x) {
        int min = Integer.MAX_VALUE;
        for (int i : x) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
