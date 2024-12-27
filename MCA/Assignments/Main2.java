public class Main2 {
    public static void main(String[] args) {
        // Create a new Car object
        Car obj1 = new Car("Maruti", "Swift", 2024, 0);
        System.out.println("Car's current state : ");
        System.out.println("Company: " + obj1.getCompany());
        System.out.println("Model: " + obj1.getModel());
        System.out.println("Year: " + obj1.getYear());
        System.out.println("Total Run: " + obj1.getRun());
        System.out.println("Is Running: " + obj1.isRunning());

        // Perform some actions on the Car object
        obj1.start();
        System.out.println("Is Running: " + obj1.isRunning());
        obj1.drive(100);
        obj1.stop();
        System.out.println("Total Run: " + obj1.getRun());
        System.out.println("Is Running: " + obj1.isRunning());

    }
}
