/*
the 'equal' and '==' both methods are different because the '==' operator compares two objects reference to see whether they both refer to the same instance. and the 'equal' method compare the characters inside a string object.
 */
public class equal {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(str1);
        System.out.println(str1 + " equals " + str2 + " ->" + str1.equals(str2));
        System.out.println(str1 + " == " + str2 + " -> " + (str1 == str2));
    }
}
