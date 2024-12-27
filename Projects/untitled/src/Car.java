public class Car {
    // Properties / Fields
    private String make;
    private String model;
    private int year;
    private double mileage;
    private boolean isRunning;

    // Constructor to initialise the values
    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.isRunning = false;
    }

    // Method / Behaviors to check car is start or not
    // If not this method start the car
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The car has started.");
        } else {
            System.out.println("The car is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The car has stopped.");
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    public void drive(double distance) {
        if (isRunning) {
            mileage += distance;
            System.out.println("The car has driven " + distance + " miles.");
        } else {
            System.out.println("You need to start the car first.");
        }
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isRunning() {
        return isRunning;
    }
}