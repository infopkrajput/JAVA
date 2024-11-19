
public class qu6 {
	
	    public static void main(String[] args) {
	        String str = "Hello, World! 123";

	        // Variable to keep track of alphabet count
	        int alphabetCount = 0;

	        // Loop through each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            // Check if the character is an alphabet (either uppercase or lowercase)
	            if (Character.isLetter(str.charAt(i))) {
	                alphabetCount++;
	            }
	        }

	        // Print the number of alphabetic characters
	        System.out.println("Number of alphabets in the string: " + alphabetCount);
	    }
	}


