public class temp {
    public static void sortBinaryArray(int[] arr) {
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // Swap arr[i] and arr[start]
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                
                start++;  // Move the pointer for the next 0
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 1};
        sortBinaryArray(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
