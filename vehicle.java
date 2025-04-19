// Base Class
class Vehicle {
    protected int speed;     // in km/h
    protected int fuel;      // in liters

    public Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void move() {
        System.out.println("Vehicle is moving at " + speed + " km/h.");
    }
}

// Derived Class: Car
class Car extends Vehicle {
    private boolean hasAirConditioner;

    public Car(int speed, int fuel, boolean hasAirConditioner) {
        super(speed, fuel);
        this.hasAirConditioner = hasAirConditioner;
    }

    public void turnOnAC() {
        if (hasAirConditioner) {
            System.out.println("Air conditioner is ON.");
        } else {
            System.out.println("No air conditioner available.");
        }
    }
}

// Derived Class: Bike
class Bike extends Vehicle {
    private boolean hasKickStart;

    public Bike(int speed, int fuel, boolean hasKickStart) {
        super(speed, fuel);
        this.hasKickStart = hasKickStart;
    }

    public void startBike() {
        if (hasKickStart) {
            System.out.println("Bike has Kick Start.");
        } else {
            System.out.println("Bike has Self Start.");
        }
    }
}

// Derived Class: Truck
class Truck extends Vehicle {
    private int cargoCapacity;   // in kg

    public Truck(int speed, int fuel, int cargoCapacity) {
        super(speed, fuel);
        this.cargoCapacity = cargoCapacity;
    }

    public void loadCargo() {
        System.out.println("Truck cargo capacity: " + cargoCapacity + " kg.");
    }
}

// Main Program
public class VehicleManagementSystem {
    public static void main(String[] args) {
        Car car = new Car(120, 40, true);
        Bike bike = new Bike(80, 15, false);
        Truck truck = new Truck(60, 100, 5000);

        // Demonstrating Car
        System.out.println("=== Car ===");
        car.move();
        car.turnOnAC();

        // Demonstrating Bike
        System.out.println("\n=== Bike ===");
        bike.move();
        bike.startBike();

        // Demonstrating Truck
        System.out.println("\n=== Truck ===");
        truck.move();
        truck.loadCargo();
    }
}
