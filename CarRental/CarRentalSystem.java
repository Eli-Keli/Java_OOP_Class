// Date: 07/02/2025
// Student: Eli Keli
// Registration Number: BSE-05-0238/2023
// Assignment1: Car Rental System

// Main class to test the system
public class CarRentalSystem {

    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Adding cars
        System.out.println("Adding cars...");
        agency.addCar(new Car("C1", "Civic", "Honda", 4000));
        agency.addCar(new Car("C2", "Corolla", "Toyota", 3500));

        // Adding customers
        System.out.println("Adding customers...\n");
        agency.addCustomer(new Customer("U1", "Eli"));
        agency.addCustomer(new Customer("U2", "Philip"));

        System.out.println("\n====================================\n");

        // Display available cars
        agency.displayAvailableCars();

        System.out.println("\n====================================\n");

        // Renting a car
        System.out.println("Renting a car...");
        agency.rentCar("U1", "C1");

        // Display available cars after rent
        agency.displayAvailableCars();

        System.out.println("\n====================================\n");

        // Trying to rent the same car again
        System.out.println("Renting the same car again...");
        agency.rentCar("U2", "C1");

        System.out.println("\n====================================\n");

        // Returning a car
        System.out.println("Returning a car...");
        agency.returnCar("C1");

        // Checking available cars after return
        agency.displayAvailableCars();
    }
}
