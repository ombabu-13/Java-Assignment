import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input strings
        System.out.print("Enter first number: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String str2 = sc.nextLine();

        // String to Wrapper Object
        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        // Wrapper Object to Primitive (Unboxing)
        int a = num1;
        int b = num2;

        // Basic Operations
        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        // Another Wrapper Object
        Integer wrapperY = Integer.valueOf(250);
        System.out.println("\nAnother Wrapper Object: " + wrapperY);

        // Primitive to Wrapper (Autoboxing)
        int x = 100;
        Integer wrapperX = x;

        System.out.println("\nPrimitive to Wrapper:");
        System.out.println("Primitive Value : " + x);
        System.out.println("Wrapper Object : " + wrapperX);

        // Wrapper to Primitive (Unboxing)
        int y = wrapperY;

        System.out.println("\nWrapper to Primitive:");
        System.out.println("Wrapper Object : " + wrapperY);
        System.out.println("Primitive Value : " + y);

        sc.close();
    }
}