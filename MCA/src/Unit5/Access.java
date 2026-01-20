package Unit5;

// Create a superclass.
class A {
    int i; // public by default
    private int j; // private to A

    // Method to set i and j
    void setij(int x, int y) {
        i = x;
        j = y;
    }

    // Getter method to access j
    int getJ() {
        return j;
    }
}

// A's j is not accessible here.
class B extends A {
    int total;

    void sum() {
        total = i + getJ(); // Access j using the getter method
    }
}

public class Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setij(10, 12); // Calling setij method
        subOb.sum(); // Calculate sum
        System.out.println("Total is " + subOb.total);
    }
}
