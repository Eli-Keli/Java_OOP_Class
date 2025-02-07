// Date: 07/02/2025
// Student: Eli Keli
// Registration Number: BSE-05-0238/2023
// Assignment1: Car Rental System

// Car Class (Encapsulation used)
public class Car {

    // Car attributes
    private String id;
    private String model;
    private String brand;
    private double pricePerDay;
    private boolean isAvailable;

    // Car constructor
    public Car(String id, String model, String brand, double pricePerDay) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    // Car functions
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        this.isAvailable = false;
    }

    public void returnCar() {
        this.isAvailable = true;
    }

    public void displayCarInfo() {
        System.out.println(id + " | " + brand + " " + model + " | Ksh." + pricePerDay + "/day | "
                + (isAvailable ? "Available" : "Rented"));
    }
}
