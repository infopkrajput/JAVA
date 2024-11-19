public class NativeExample {
    // Declare a native method
    public native void displayMessage();

    static {
        // Load the native library
        System.loadLibrary("nativeLib");
    }

    public static void main(String[] args) {
        new NativeExample().displayMessage();
    }
}
