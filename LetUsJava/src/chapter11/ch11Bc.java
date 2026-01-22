// Write a program that interchanges the odd and even elements of an array.
package chapter11;

public class ch11Bc {
    static void main() {
        int[] arr = {12, 35, 47, 50, 86, 93, 24, 68, 79};
        System.out.println("Original array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println("\nArray after interchanging odd and even elements: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
