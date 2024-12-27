public class Main {
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car("Martin", "Swift", 2024, 15000);

        // Perform some actions on the Car object
        myCar.start();
        myCar.drive(100);
        myCar.stop();

        // Print the car's details
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage());
        System.out.println("Is Running: " + myCar.isRunning());
    }
}