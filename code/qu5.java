
public class qu5 {

	    public static void main(String[] args) {
	        String str = "Hello, how many spaces are in this sentence?";

	        // Variable to keep track of space count
	        int spaceCount = 0;

	        // Loop through each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            // Check if the character is a space
	            if (str.charAt(i) == ' ') {
	                spaceCount++;
	            }
	        }

	        // Print the number of spaces
	        System.out.println("Number of spaces in the string: " + spaceCount);
	    }
	}


