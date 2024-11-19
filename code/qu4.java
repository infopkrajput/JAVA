
public class qu4 {

	    public static void main(String[] args) {
	        String str = "INCAPP";

	        // Loop to print the pattern
	        for (int i = 0; i < str.length(); i++) {
	            // Print the first part of the pattern (from 0 to i)
	            System.out.print(str.substring(0, str.length() - i));

	            // Print spaces equal to the number of characters removed
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }

	            // Print the second part of the pattern (from i to the end)
	            System.out.println(str.substring(i));
	        }
	    }
	}

