class Animal {
    String name = "Animal";

    void display() {
        System.out.println("This is the Animal class.");
    }
}
class Dog extends Animal {
    String name = "Dog";

    void display() {
        super.display(); // Calls parent class method
        System.out.println("Parent class name: " + super.name); // Accesses parent variable
        System.out.println("Child class name: " + name);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
