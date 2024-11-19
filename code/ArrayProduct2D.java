public class ArrayProduct2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Variable to keep track of the product
        long product = 1;

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                product *= matrix[i][j];  // Multiply each element with the product
            }
        }

        // Print the product of the elements
        System.out.println("The product of all elements in the 2D array is: " + product);
    }
}
