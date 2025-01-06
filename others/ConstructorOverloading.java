class Car {
    String brand;
    String color;
    int speed;

    // Constructor with no parameters (default constructor)
    Car() {
        brand = "Unknown";
        color = "White";
        speed = 0;
    }

    // Constructor with one parameter
    Car(String brand) {
        this.brand = brand;
        color = "White";
        speed = 0;
    }

    // Constructor with two parameters
    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        speed = 0;
    }

    // Constructor with three parameters
    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Speed: " + speed);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Car car1 = new Car(); // Calls default constructor
        Car car2 = new Car("Toyota"); // Calls constructor with one parameter
        Car car3 = new Car("Honda", "Red"); // Calls constructor with two parameters
        Car car4 = new Car("BMW", "Black", 200); // Calls constructor with three parameters

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
        car4.displayInfo();
    }
}

