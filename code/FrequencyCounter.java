import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5, 1, 2, 4, 6, 5};

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Loop through the array
        for (int number : numbers) {
            // If the element is already in the map, increment its frequency
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                // Otherwise, add the element to the map with a frequency of 1
                frequencyMap.put(number, 1);
            }
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " | Frequency: " + entry.getValue());
        }
    }
}

