// Write a program to copy the contents of one array into another in the reverse order.
package chapter11;

public class ch11Bd {
    static void main() {
        int [] original = {1, 2, 3, 4, 5};
        // Display the original array
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println();
        int [] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        // Display the reversed array
        for (int num : reversed) {
            System.out.print(num + " ");
        }

    }
}
