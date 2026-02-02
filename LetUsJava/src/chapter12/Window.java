package chapter12;

enum CursorType {
    ARROW,
    CROSSHAIR,
    HAND,
    WAIT,
    TEXT_BEAM
}

enum WindowColor {
    WHITE,
    BLACK,
    BLUE,
    RED,
    GRAY
}

// 2. Define the Window Class
class Window {
    // Data members
    double height;
    double width;
    CursorType cursorType;
    WindowColor windowColor;

    // Constructor to initialize the object
    public Window(double height, double width, CursorType cursorType, WindowColor windowColor) {
        this.height = height;
        this.width = width;
        this.cursorType = cursorType;
        this.windowColor = windowColor;
    }

    // Method to display window details
    public void printDetails() {
        System.out.println("--- Window Details ---");
        System.out.println("Height      : " + height);
        System.out.println("Width       : " + width);
        System.out.println("Cursor Type : " + cursorType);
        System.out.println("Window Color: " + windowColor);
        System.out.println();
    }
}