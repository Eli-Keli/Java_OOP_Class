# Car Rental System: Assignment 1

This project is a simple Car Rental System implemented in Java. It allows a rental agency to manage cars, customers, and rental transactions.

## Features

- Add new cars to the rental agency's inventory
- Add new customers to the rental agency's database
- Rent a car to a customer
- Return a rented car
- Display available cars

## Instructions for Running the Main Program

1. Ensure you have Java installed on your machine.
2. Navigate to the `CarRental/` directory in your terminal.
3. Compile the Java files using the following command:
    ```sh
    javac *.java
    ```
4. Run the main program using the following command:
    ```sh
    java CarRentalSystem
    ```

## Expected Output
Adding cars...
Adding customers...

====================================

Available Cars:
C1 | Honda Civic | Ksh.4000.0/day | Available
C2 | Toyota Corolla | Ksh.3500.0/day | Available

====================================

Renting a car...
Eli has rented the car: Civic
Available Cars:
C2 | Toyota Corolla | Ksh.3500.0/day | Available

====================================

Renting the same car again...
Car not available or customer not found.

====================================

Returning a car...
Eli has returned the car: Civic
Available Cars:
C1 | Honda Civic | Ksh.4000.0/day | Available
C2 | Toyota Corolla | Ksh.3500.0/day | Available
