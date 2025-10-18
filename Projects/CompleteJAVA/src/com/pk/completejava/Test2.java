interface Vehicle {
    static int x = 5;
    void drive();

    default void fuel() {
        System.out.println("Filling fuel (default method)");
    }

    static void service() {
        System.out.println("Vehicle servicing (static method)");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Car c = new Car();
//        c.drive();
//        c.fuel();          // calls default method
//        Vehicle.service(); // calls static method
        System.out.println(c.x);
        System.out.println(Vehicle.x);
    }
}
