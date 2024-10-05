public class ch7B_b {
    public static void main(String[] args) {
        // message();
        // message();
    }

    public void message() {
        System.out.println("Praise worthy effort!");
    }
}
/*
 * Problem:
 * The main method is static, which means it belongs to the class and not to an
 * instance of the class.
 * The message() method is not static, so it belongs to an instance of the
 * class, not the class itself. You cannot call an instance method directly from
 * static method without creating an instance of the class.
 * 
 * Two Solutions:
 * 
 * 1. Make message() a static method (so it can be called inside the static main
 * method):
 * 
 * public class ch7B_b {
 * public static void main(String[] args) {
 * message();
 * message();
 * }
 * public static void message() {
 * System.out.println("Praise worthy effort!");
 * }
 * }
 * By making the message() method static, it can now be called directly from the
 * main method.
 * 
 * Create an instance of the class and call the message() method from that instance:
 * 
 * public class ch7B_b {
 * public static void main(String[] args) {
 * ch7B_b obj = new ch7B_b(); // Create an instance of the class
 * obj.message(); // Call the instance method
 * obj.message(); // Call the instance method again
 * }
 * public void message() {
 * System.out.println("Praise worthy effort!");
 * }
 * }
 */
