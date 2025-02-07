// Date: 07/02/2025
// Student: Eli Keli
// Registration Number: BSE-05-0238/2023
// Assignment1: Login System

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to read input

        // Hardcoded username and password (for testing)
        final String correctUsername = "EliKeli";
        final String correctPassword = "password123";

        int attempts = 3; // Allow 3 attempts

        System.out.println("Welcome to the Login System!");

        // Loop until successful login or no attempts left
        while (attempts > 0) {
            // Prompt user for username and password
            System.out.print("Enter Username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter Password: ");
            String enteredPassword = scanner.nextLine();

            System.out.println(); // New line

            // Check credentials
            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("Login Successful! Welcome, " + enteredUsername + "!");
                System.out.println("Exiting...");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect username or password. " + attempts + " attempt(s) left.");

                System.out.println(); // New line
            }

            if (attempts == 0) {
                System.out.println("Too many failed attempts. Exiting...");
            }
        }

        scanner.close();
    }
}
