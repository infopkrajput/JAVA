package Assignments;

public class Car {
    // Properties / Fields / Variables
    private String company;
    private String model;
    private int year;
    private double run;
    private boolean isRunning;

    // Constructor for initial value
    public Car(String company, String model, int year, double run) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.run = run;
        this.isRunning = false;
    }

    // Method / Behaviors to check car is start or not If not this method start the
    // car
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
    // Run distance
    public void drive(double distance) {
        if (isRunning) {
            run += distance;
            System.out.println("The car has driven " + distance + " km.");
        } else {
            System.out.println("You need to start the car first.");
        }
    }

    // Getters and Setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
