import java.util.Scanner;

public class WrapperClassDemo {
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String str2 = sc.nextLine();

        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        int a = num1;
        int b = num2;

        System.out.println("\nNumbers:");
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);

        
        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + (a / b));
            System.out.println("Remainder = " + (a % b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        int x = 100;
        Integer wrapperX = x;

        System.out.println("\nPrimitive to Wrapper (Autoboxing):");
        System.out.println("Primitive value : " + x);
        System.out.println("Wrapper Object  : " + wrapperX);

        Integer wrapperY = Integer.valueOf(250);
        int y = wrapperY;

        System.out.println("\nWrapper to Primitive (Unboxing):");
        System.out.println("Wrapper Object  : " + wrapperY);
        System.out.println("Primitive value : " + y);

        sc.close();
    }
}
