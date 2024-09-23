public class Region_Matches {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Using regionMatches with case-insensitive comparison
        if (str1.regionMatches(true, 0, str2, 0, 4)) {
            
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
