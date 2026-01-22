// Write a program to generate all combinations of 1, 2 and 3 using for loops.
package chapter5;

public class ch5Ce {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                for (int k = j; k <= 3; k++) {
                    System.out.print(i + " " + j + " " + k);
                    System.out.println();
                }
            }

        }
    }
}
