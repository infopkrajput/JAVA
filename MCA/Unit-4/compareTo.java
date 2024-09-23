/*
The compareTo() method in Java is used to compare two objects (typically strings or other objects implementing the Comparable interface) to determine their relative order. It returns an integer value based on the result of the comparison, which helps determine whether one object is less than, equal to, or greater than another.
The compareTo() method returns an integer, and the meaning of the return value is as follows:
-> Negative Integer: If the current object (the one calling compareTo()) is less than the specified object.
-> Zero (0): If the current object is equal to the specified object.
-> Positive Integer: If the current object is greater than the specified object.
 */
public class compareTo {
    static String arr[] = { "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid",
            "of", "their", "country" };

    public static void main(String args[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Now comparing with ignoring case sensitivity");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
