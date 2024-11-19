public class MaxElement2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 5, 7},
            {1, 8, 6},
            {9, 2, 4}
        };

        // Assume the first element is the maximum
        int max = matrix[0][0];

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Update max if the current element is greater
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // Print the maximum element
        System.out.println("The maximum element in the 2D array is: " + max);
    }
}
