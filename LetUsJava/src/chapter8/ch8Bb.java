// Define a function min( ) that can find out and return minimum out of variable number of integers passed to it.

package chapter8;

import java.util.*;

public class ch8Bb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5, b = 7, c = 2, d = 9, e = 1, f = 8;
        int m = min(a, b, c, d, e, f);
        System.out.print("Minimum " + m);
    }

    public static int min(int n, int... x) {
        int min = Integer.MAX_VALUE;
        for (int i : x) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
