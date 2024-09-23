public class StringComparisonEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        if(str1.equals(str2))
        {
            System.out.println("Both strings are equal.");
        }
        else
        {
            System.out.println("Both strings are not equal.");
        }
        String str3 = "hello";
        if(str1.equalsIgnoreCase(str3))
        {
            System.out.println("Both strings are equal, ignoring case.");
        }
        else
        {
            System.out.println("Both strings are not equal, ignoring case.");
        }
    }    
}
