// Create a superclass with non-parametric method . When method of parent class is called , it should display a method– ‘"Parent work."
// Create subclass  and extend superclass. 
// Create same method of superclass in subclass . When a method of subclass is called, it should display a message – ‘Override Parent work’
// Create Main class and create objects of superclass and subclass.
// Call the method of superclass to print the message - ‘Parent work’
// call the method of subclass to print the message– ‘Override Parent work’

class SuperClass {
    void parentWork() {
        System.out.println("Parent work.");
    }
};

class SubClass extends SuperClass {
    void parentWork() {
        System.out.println("Override Parent work.");
    };
};

public class Main {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass();
        obj1.parentWork();

        SubClass obj2 = new SubClass();
        obj2.parentWork();
    }
};
