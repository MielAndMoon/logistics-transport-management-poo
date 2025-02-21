public interface Maintenance {
    void performMaintenance();
}

public abstract class Vehicle implements Maintenance {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private String status;

    public Vehicle(String brand, String model, int year, double mileage, String status) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.status = status;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getMileage() { return mileage; }
    public String getStatus() { return status; }

    public void setMileage(double mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract double calculateMaintenanceCost();
}

public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(String brand, String model, int year, double mileage, String status, int numberOfDoors, String fuelType) {
        super(brand, model, year, mileage, status);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public double calculateMaintenanceCost() {
        return getMileage() * 0.05;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the car " + getModel());
    }
}

public class Truck extends Vehicle {
    private double loadCapacity;
    private int numberOfAxles;

    public Truck(String brand, String model, int year, double mileage, String status, double loadCapacity, int numberOfAxles) {
        super(brand, model, year, mileage, status);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public double calculateMaintenanceCost() {
        return getMileage() * 0.1 + loadCapacity * 2;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the truck " + getModel());
    }
}

public class Motorcycle extends Vehicle {
    private int engineDisplacement;

    public Motorcycle(String brand, String model, int year, double mileage, String status, int engineDisplacement) {
        super(brand, model, year, mileage, status);
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public double calculateMaintenanceCost() {
        return getMileage() * 0.03 + engineDisplacement * 0.05;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the motorcycle " + getModel());
    }
}

