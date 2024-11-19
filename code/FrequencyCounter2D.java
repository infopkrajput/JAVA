import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 3, 4},
            {4, 5, 2}
        };

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                int element = matrix[i][j];
                // If the element is already in the map, increment its frequency
                if (frequencyMap.containsKey(element)) {
                    frequencyMap.put(element, frequencyMap.get(element) + 1);
                } else {
                    // Otherwise, add the element to the map with a frequency of 1
                    frequencyMap.put(element, 1);
                }
            }
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " | Frequency: " + entry.getValue());
        }
    }
}
