abstract class Shape {
    abstract void area();   // Abstract method

    void display() {        // Normal method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class abstraact {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.display();
        c.area();
    }
}