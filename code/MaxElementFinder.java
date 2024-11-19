

	public class MaxElementFinder {
	    public static void main(String[] args) {
	        int[] numbers = {23, 89, 15, 34, 90, 12, 77};

	        // Assume the first element is the maximum
	        int max = numbers[0];

	        // Loop through the array to find the maximum element
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];  // Update max if the current element is greater
	            }
	        }

	        // Print the maximum element
	        System.out.println("The maximum element in the array is: " + max);
	    }
	}


