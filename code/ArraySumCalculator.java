public class ArraySumCalculator {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Example array

        // Variable to keep track of the sum
        int sum = 0;

        // Loop through the array to calculate the sum of elements
        for (int number : numbers) {
            sum += number;  // Add each element to the sum
        }

        // Print the sum of the elements
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}

