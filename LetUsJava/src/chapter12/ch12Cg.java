// Create a class called Window containing data members height, width, cursortype and windowcolor. Of these, the last two should be enumerations. Create two objects of type Window and set and print values of these objects. Make sure that the enum values are printed as strings.
package chapter12;

public class ch12Cg {
    static void main() {
        // Create first object (Window 1)
        Window window1 = new Window(600.5, 800.0, CursorType.ARROW, WindowColor.BLUE);

        // Create second object (Window 2)
        Window window2 = new Window(1080.0, 1920.0, CursorType.CROSSHAIR, WindowColor.BLACK);

        // Print values
        window1.printDetails();
        window2.printDetails();

    }
}
