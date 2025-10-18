//package com.pk.completejava;
//
//import com.pk.completejava.datatypes.Arithmetic;
//
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//    }
//}
//
//// 1
//class MatrixAddition {
//    public static void main(String[] args) {
//        // Define two 2D matrices
//        int[][] matrix1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int[][] matrix2 = {
//                {9, 8, 7},
//                {6, 5, 4},
//                {3, 2, 1}
//        };
//
//        // Resultant matrix
//        int[][] result = new int[3][3];
//
//        // Adding two matrices
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                result[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//        }
//
//        // Print result
//        System.out.println("Result of Matrix Addition:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//// 2
//public class MatrixTranspose {
//    public static void main(String[] args) {
//        // Original matrix
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        // Transpose matrix (same size)
//        int[][] transpose = new int[3][3];
//
//        // Logic for transpose (rows -> columns)
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                transpose[j][i] = matrix[i][j];
//            }
//        }
//
//        // Print original matrix
//        System.out.println("Original Matrix:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // Print transpose matrix
//        System.out.println("\nTranspose of Matrix:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(transpose[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
////3
//public class MatrixMultiplication {
//    public static void main(String[] args) {
//        // First matrix (2x3)
//        int[][] matrix1 = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        // Second matrix (3x2)
//        int[][] matrix2 = {
//                {7, 8},
//                {9, 10},
//                {11, 12}
//        };
//
//        // Resultant matrix (2x2)
//        int[][] result = new int[matrix1.length][matrix2[0].length];
//
//        // Matrix multiplication logic
//        for (int i = 0; i < matrix1.length; i++) {        // row of first
//            for (int j = 0; j < matrix2[0].length; j++) { // column of second
//                for (int k = 0; k < matrix1[0].length; k++) { // column of first / row of second
//                    result[i][j] += matrix1[i][k] * matrix2[k][j];
//                }
//            }
//        }
//
//        // Print result
//        System.out.println("Result of Matrix Multiplication:");
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[0].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
////4
//public class RowColumnSum {
//    public static void main(String[] args) {
//        // Define a 2D matrix
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        // Calculate sum of each row
//        System.out.println("Sum of each Row:");
//        for (int i = 0; i < rows; i++) {
//            int rowSum = 0;
//            for (int j = 0; j < cols; j++) {
//                rowSum += matrix[i][j];
//            }
//            System.out.println("Row " + (i + 1) + ": " + rowSum);
//        }
//
//        // Calculate sum of each column
//        System.out.println("\nSum of each Column:");
//        for (int j = 0; j < cols; j++) {
//            int colSum = 0;
//            for (int i = 0; i < rows; i++) {
//                colSum += matrix[i][j];
//            }
//            System.out.println("Column " + (j + 1) + ": " + colSum);
//        }
//    }
//}
//
////5
//import java.util.Scanner;
//
//public class SearchIn2DArray {
//    public static void main(String[] args) {
//        int[][] matrix = {
//                {10, 20, 30},
//                {40, 50, 60},
//                {70, 80, 90}
//        };
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number to search: ");
//        int key = sc.nextInt();
//
//        boolean found = false;
//
//        // Searching for the number
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == key) {
//                    System.out.println("Number " + key + " found at position (" + i + ", " + j + ")");
//                    found = true;
//                }
//            }
//        }
//
//        if (!found) {
//            System.out.println("Number " + key + " not found in the matrix.");
//        }
//
//        sc.close();
//    }
//}
//
//// 6
//public class Test2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] arr1 = new int[5][6];
//        int i, j, choice, count, seat;
//
//        while (true) {
//            System.out.println("1. Book Seat.");
//            System.out.println("2. View Seats.");
//            System.out.println("3. exit");
//            System.out.print("Enter your choice : ");
//            choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    count = 1;
//                    System.out.print("Enter seat no. : ");
//                    seat = sc.nextInt();
//
//                    for (i = 0; i < arr1.length; i++) {
//                        for (j = 0; j < arr1[0].length; j++) {
//                            if (count == seat) {
//                                if (arr1[i][j] == 1) {
//                                    System.out.println("Seat already booked!");
//                                } else {
//                                    arr1[i][j] = 1;
//                                    System.out.println("Seat booked!");
//                                }
//                            }
//                            count++;
//                        }
//
//                    }
//
//                    break;
//                case 2:
//
//                    for (i = 0; i < arr1.length; i++) {
//                        for (j = 0; j < arr1[0].length; j++) {
//                            System.out.print(arr1[i][j] + " ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 3:
//                    System.exit(1);
//                    break;
//
//                default:
//                    System.out.println("Please choose a correct option!");
//                    break;
//            }
//        }
//
//    }
//
//}
//
//// 7
