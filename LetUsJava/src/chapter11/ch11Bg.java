// Create a jagged array of integers. This array should consist of two 2-D arrays. First 2-D array should contain 3 rows having length of 4, 3 and 2, respectively. Second 2-D array should contain 2 rows with length 3 and 4, respectively. Initialize array with suitable elements and display them without using for loops.
package chapter11;

public class ch11Bg {
    static void main() {
        int[][][] jaggedArray = {
            { {1, 2, 3, 4}, {5, 6, 7}, {8, 9} },
            { {10, 11, 12}, {13, 14, 15, 16} }
        };

        System.out.println("First 2-D Array:");
        System.out.println("Row 1: " + jaggedArray[0][0][0] + ", " + jaggedArray[0][0][1] + ", " + jaggedArray[0][0][2] + ", " + jaggedArray[0][0][3]);
        System.out.println("Row 2: " + jaggedArray[0][1][0] + ", " + jaggedArray[0][1][1] + ", " + jaggedArray[0][1][2]);
        System.out.println("Row 3: " + jaggedArray[0][2][0] + ", " + jaggedArray[0][2][1]);

        System.out.println("\nSecond 2-D Array:");
        System.out.println("Row 1: " + jaggedArray[1][0][0] + ", " + jaggedArray[1][0][1] + ", " + jaggedArray[1][0][2]);
        System.out.println("Row 2: " + jaggedArray[1][1][0] + ", " + jaggedArray[1][1][1] + ", " + jaggedArray[1][1][2] + ", " + jaggedArray[1][1][3]);

    }
}
