// Date: 07/02/2025
// Student: Eli Keli
// Registration Number: BSE-05-0238/2023
// Assignment1: Car Rental System

import java.util.ArrayList;

// RentalAgency class that manages the rental agency
public class RentalAgency {

    private ArrayList<Car> cars; // List of cars
    private ArrayList<Customer> customers; // List of customers
    private ArrayList<RentalTransaction> transactions; // List of transactions

    // RentalAgency constructor
    public RentalAgency() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Functions to add car, customer and rent car
    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(String customerId, String carId) {
        Customer customer = customers.stream().filter(c -> c.getCustomerId().equals(customerId)).findFirst().orElse(null);
        Car car = cars.stream().filter(c -> c.getId().equals(carId) && c.isAvailable()).findFirst().orElse(null);

        if (customer != null && car != null) {
            RentalTransaction transaction = new RentalTransaction(customer, car);
            transactions.add(transaction);
            transaction.processRental();
        } else {
            System.out.println("Car not available or customer not found.");
        }
    }

    public void returnCar(String carId) {
        for (RentalTransaction transaction : transactions) {
            if (transaction.getCar().getId().equals(carId)) {
                transaction.returnRental();
                return;
            }
        }
        System.out.println("No active rental found for this car.");
    }

    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                car.displayCarInfo();
            }
        }
    }
}
