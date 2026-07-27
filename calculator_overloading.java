class Calculator {

    // Static variable to count calculations
    static int count = 0;

    // Addition of two integers
    int add(int a, int b) {
        count++;
        return a + b;
    }

    // Addition of three integers
    int add(int a, int b, int c) {
        count++;
        return a + b + c;
    }

    // Addition of two decimal numbers
    double add(double a, double b) {
        count++;
        return a + b;
    }

    static void displayCount() {
        System.out.println("Total Calculations = " + count);
    }
}

public class calculator_overloading {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition of Integers: " + c.add(10, 20));
        System.out.println("Addition of Three Integers: " + c.add(10, 20, 30));
        System.out.println("Addition of Decimals: " + c.add(10.5, 20.8));

        Calculator.displayCount();
    }
}