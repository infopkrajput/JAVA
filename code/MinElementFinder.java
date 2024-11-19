
public class MinElementFinder {
    public static void main(String[] args) {
        int[] numbers = {23, 89, 15, 34, 90, 12, 77};

        // Assume the first element is the minimum
        int min = numbers[0];

        // Loop through the array to find the minimum element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];  // Update min if the current element is smaller
            }
        }

        // Print the minimum element
        System.out.println("The minimum element in the array is: " + min);
    }
}
