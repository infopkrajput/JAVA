public class ArrayProductCalculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};  // Example array

        // Variable to keep track of the product
        int product = 1;

        // Loop through the array to calculate the product of elements
        for (int number : numbers) {
            product *= number;  // Multiply each element with the product
        }

        // Print the product of the elements
        System.out.println("The product of all elements in the array is: " + product);
    }
}
