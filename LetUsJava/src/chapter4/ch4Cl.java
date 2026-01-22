// What will be the result of the following expressions:
// int a = 10 ;
// int b = 20 ;
// a > 5 && b != 5
// a != 0 & b < 34
// a > 45 || b > 45
// a == 10 | b == 20
// a > 5 && b != 3 || a + b >= 10
// a > 5 || b != 3 && a + b >= 10
package chapter4;

import java.util.*;

public class ch4Cl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println(a > 5 && b != 5); // true
        System.out.println(a != 0 & b < 34); // true
        System.out.println(a > 45 || b > 45); // false
        System.out.println(a == 10 | b == 20); // true
        System.out.println(a > 5 && b != 3 || a + b >= 10); // true
        System.out.println(a > 5 || b != 3 && a + b >= 10); // true
    }
}
