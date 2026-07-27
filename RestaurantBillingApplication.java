import java.util.Scanner;

class RestaurantBill {

    // Static variable to count total orders
    static int totalOrders = 0;

    void calculateBill(double amount) {
        totalOrders++;
        System.out.println("Dine-in Bill = " + amount);
    }

    void calculateBill(double amount, double packingCharge) {
        totalOrders++;
        double total = amount + packingCharge;
        System.out.println("Takeaway Bill = " + total);
    }

    void calculateBill(double amount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        double total = amount + packingCharge + deliveryCharge;
        System.out.println("Delivery Bill = " + total);
    }

    // Display total orders
    static void showOrders() {
        System.out.println("Total Orders = " + totalOrders);
    }
}

public class RestaurantBillingApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RestaurantBill bill = new RestaurantBill();

        System.out.println("Restaurant Billing System");
        System.out.println("1. Dine-in");
        System.out.println("2. Takeaway");
        System.out.println("3. Delivery");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter food amount: ");
                double amount1 = sc.nextDouble();
                bill.calculateBill(amount1);
                break;

            case 2:
                System.out.print("Enter food amount: ");
                double amount2 = sc.nextDouble();
                System.out.print("Enter packing charge: ");
                double packing = sc.nextDouble();
                bill.calculateBill(amount2, packing);
                break;

            case 3:
                System.out.print("Enter food amount: ");
                double amount3 = sc.nextDouble();
                System.out.print("Enter packing charge: ");
                double packingCharge = sc.nextDouble();
                System.out.print("Enter delivery charge: ");
                double delivery = sc.nextDouble();
                bill.calculateBill(amount3, packingCharge, delivery);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        RestaurantBill.showOrders();

        sc.close();
    }
}
