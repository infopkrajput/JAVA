package Assignments;

class Parent {
    void display() {
        System.out.println("Parent class method called.");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Child class method called.");
    }
    void display2(){
        super.display();  // Calls the Parent class method
    }
}
public class Main3 {
    static void main() {
        Child obj = new Child();
        obj.display();
        obj.display2();
    }
}