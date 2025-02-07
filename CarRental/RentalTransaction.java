// Date: 07/02/2025
// Student: Eli Keli
// Registration Number: BSE-05-0238/2023
// Assignment1: Car Rental System

// RentalTransaction class
class RentalTransaction {

    private Customer customer; // Customer object
    private Car car; // Car object

    // RentalTransaction constructor
    public RentalTransaction(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
    }

    // Function to process rental
    public void processRental() {
        if (car.isAvailable()) {
            car.rentCar();
            System.out.println(customer.getName() + " has rented the car: " + car.getModel());
        } else {
            System.out.println("Car is already rented!");
        }
    }

    public void returnRental() {
        car.returnCar();
        System.out.println(customer.getName() + " has returned the car: " + car.getModel());
    }

    // Get the car object
    public Car getCar() {
        return car;
    }
}
