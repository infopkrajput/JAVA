// Write a program to obtain transpose of a 4 x 4 matrix. The transpose of a matrix is obtained by exchanging the elements of each row with the elements of the corresponding column.
package chapter11;

public class ch11Be {
    static void main() {
        int [][] arr1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int [][] transpose = new int[4][4];
        // Original Matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        // Transpose of Matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpose[j][i] = arr1[i][j];
            }
        }
        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
