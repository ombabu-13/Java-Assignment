class Parent {
    final int MAX_SPEED = 120;   // Final variable

    final void displaySpeed() {  // Final method
        System.out.println("Maximum Speed: " + MAX_SPEED + " km/h");
    }
}

// Final class cannot be inherited
final class Car extends Parent {
    void displayCar() {
        System.out.println("This is a Car.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Car c = new Car();

        System.out.println("Maximum Speed: " + c.MAX_SPEED);
        c.displaySpeed();
        c.displayCar();

        // c.MAX_SPEED = 150;  // Error: final variable cannot be changed
    }
}