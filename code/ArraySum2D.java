public class ArraySum2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Variable to keep track of the sum
        int sum = 0;

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];  // Add each element to the sum
            }
        }

        // Print the sum of the elements
        System.out.println("The sum of all elements in the 2D array is: " + sum);
    }
}
