// Abstract class Vehicle
package array;
abstract class VehicleArray {
    // Abstract method start()
    public abstract void start();

    // Abstract method stop()
    public abstract void stop();
}

// Car class extending Vehicle
class Car extends VehicleArray {
    // Implementing start() method for Car
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    // Implementing stop() method for Car
    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

// Motorcycle class extending Vehicle
class Motorcycle extends VehicleArray {
    // Implementing start() method for Motorcycle
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    // Implementing stop() method for Motorcycle
    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

// Main class to demonstrate starting and stopping operations
 class Main {
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car();
        // Starting the car
        car.start();
        // Stopping the car
        car.stop();

        // Creating a Motorcycle object
        Motorcycle motorcycle = new Motorcycle();
        // Starting the motorcycle
        motorcycle.start();
        // Stopping the motorcycle
        motorcycle.stop();
    }
}
