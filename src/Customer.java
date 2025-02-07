// Date: 07/02/2025
// Student: Eli Keli
// Registration Number: BSE-05-0238/2023
// Assignment1: Car Rental System

// Customer class (Encapsulation)
class Customer {

    // Customer attributes
    private String customerId;
    private String name;

    // Customer constructor
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Customer functions
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}
