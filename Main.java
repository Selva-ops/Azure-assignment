// Defining the Car class
class Car {
    // Properties (attributes)
    String brand;
    String model;
    int year;
    String color;

    // Constructor to initialize the Car object
    Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    // Method to start the car
    void startCar() {
        System.out.println(brand + " " + model + " is starting...");
    }

    // Method to stop the car
    void stopCar() {
        System.out.println(brand + " " + model + " is stopping...");
    }
}

// Main class to create and use the Car object
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2020, "Red");

        // Using methods from the Car class
        myCar.displayDetails();
        myCar.startCar();
        myCar.stopCar();
    }
}
