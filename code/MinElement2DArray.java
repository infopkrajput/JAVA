public class MinElement2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 5, 7},
            {1, 8, 6},
            {9, 2, 4}
        };

        // Assume the first element is the minimum
        int min = matrix[0][0];

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Update min if the current element is smaller
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        // Print the minimum element
        System.out.println("The minimum element in the 2D array is: " + min);
    }
}
