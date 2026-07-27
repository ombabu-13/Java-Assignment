class Mobile {

    String brand;
    String model;
    double price;

    // Default Constructor
    Mobile() {
        brand = "Samsung";
        model = "Galaxy A15";
        price = 20000;
    }

    // Parameterized Constructor
    Mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    // Copy Constructor
    Mobile(Mobile mob) {
        brand = mob.brand;
        model = mob.model;
        price = mob.price;
    }

    // Display Method
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println();
    }
}

public class MobileInventory {
    public static void main(String[] args) {

        // Default Constructor
        Mobile m1 = new Mobile();

        // Parameterized Constructor
        Mobile m2 = new Mobile("Apple", "iPhone 16", 89999);

        // Copy Constructor
        Mobile m3 = new Mobile(m2);

        System.out.println("Default Constructor:");
        m1.display();

        System.out.println("Parameterized Constructor:");
        m2.display();

        System.out.println("Copy Constructor (Duplicate Record):");
        m3.display();
    }
}