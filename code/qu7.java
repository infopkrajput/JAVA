
public class qu7 {

	    public static void main(String[] args) {
	        String str = "madam";  // Example string
	        String originalStr = str;  // Keep the original string
	        str = str.toLowerCase();  // Convert the string to lowercase to make it case-insensitive

	        // Reverse the string
	        String reversedStr = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversedStr += str.charAt(i);
	        }

	        // Check if the original string is equal to the reversed string
	        if (str.equals(reversedStr)) {
	            System.out.println(originalStr + " is a palindrome.");
	        } else {
	            System.out.println(originalStr + " is not a palindrome.");
	        }
	    }
	}

