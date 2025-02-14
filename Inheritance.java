// Base class - Car
class Car {
    // Attributes of the Car class
    String brand;
    String model;
    double price;

    // Constructor of Car class
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

// Subclass - Audi
class Audi extends Car {
    // Additional attribute specific to Audi
    int batteryCapacity;

    // Constructor of Audi class, calling the parent class constructor
    public Audi(String brand, String model, double price, int batteryCapacity) {
        super(brand, model, price); // Using 'super' to call the constructor of the parent class
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display Audi-specific details, overriding the base class method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the displayInfo() method of the parent class
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass - Ferrari
class Ferrari extends Car {
    // Additional attribute specific to Ferrari
    int fuelTankCapacity;

    // Constructor of Ferrari class, calling the parent class constructor
    public Ferrari(String brand, String model, double price, int fuelTankCapacity) {
        super(brand, model, price); // Using 'super' to call the constructor of the parent class
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Method to display Ferrari-specific details, overriding the base class method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the displayInfo() method of the parent class
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

// Subclass - Lamborghini
class Lamborghini extends Car {
    // Additional attribute specific to Lamborghini
    int speed;

    // Constructor of Lamborghini class, calling the parent class constructor
    public Lamborghini(String brand, String model, double price, int speed) {
        super(brand, model, price); // Using 'super' to call the constructor of the parent class
        this.speed = speed;
    }

    // Method to display Lamborghini-specific details, overriding the base class method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the displayInfo() method of the parent class
        System.out.println("Top Speed: " + speed + " km/h");
    }
}

// Main class to test the above implementation
public class Main {
    public static void main(String[] args) {
        // Creating objects of Audi, Ferrari, and Lamborghini
        Audi audi = new Audi("Audi", "A6", 50000, 85);
        Ferrari ferrari = new Ferrari("Ferrari", "488", 250000, 80);
        Lamborghini lamborghini = new Lamborghini("Lamborghini", "Aventador", 400000, 350);

        // Calling the displayInfo() method for each car object
        System.out.println("\nAudi Details:");
        audi.displayInfo(); // Calls the overridden displayInfo() method of Audi
        System.out.println("\nFerrari Details:");
        ferrari.displayInfo(); // Calls the overridden displayInfo() method of Ferrari
        System.out.println("\nLamborghini Details:");
        lamborghini.displayInfo(); // Calls the overridden displayInfo() method of Lamborghini
    }
}
/*
Explanation:
Car Class:

This is the base class with attributes common to all cars: brand, model, and price.
The constructor initializes these attributes when a Car object is created.
The displayInfo() method prints the car's details.
Audi Class:

The Audi class extends the Car class and adds an additional attribute batteryCapacity.
It has a constructor that calls the parent class constructor using the super keyword and initializes the batteryCapacity.
The displayInfo() method is overridden to include the Audi-specific attribute batteryCapacity while calling the parent class's displayInfo() method using super.displayInfo().
Ferrari Class:

The Ferrari class extends the Car class and adds an attribute fuelTankCapacity.
Similar to Audi, the constructor uses super() to call the parent class constructor and initialize fuelTankCapacity.
The displayInfo() method is overridden to include the Ferrari-specific attribute fuelTankCapacity.
Lamborghini Class:

The Lamborghini class extends the Car class and adds an attribute speed.
The constructor uses super() to call the parent class constructor and initialize speed.
The displayInfo() method is overridden to include the Lamborghini-specific attribute speed.
Main Class:

In the Main class, we create objects of Audi, Ferrari, and Lamborghini.
We then call their displayInfo() method to print out the details of each car.
Key Concepts Used:
Inheritance: Audi, Ferrari, and Lamborghini classes inherit the attributes and methods of the Car class.
Method Overriding: The displayInfo() method is overridden in each subclass to add additional attributes.
super Keyword: Used to call the constructor and methods of the parent class (Car).
*/
