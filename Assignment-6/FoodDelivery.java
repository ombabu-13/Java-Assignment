interface DeliveryStatus {
    void updateStatus();
}

public class FoodDelivery {

    String foodName = "Pizza";
    int quantity = 2;

    class OrderDetails {
        void displayOrder() {
            System.out.println("Food: " + foodName);
            System.out.println("Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        FoodDelivery order = new FoodDelivery();

        OrderDetails details = order.new OrderDetails();
        details.displayOrder();

        DeliveryStatus status1 = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Order is being prepared.");
            }
        };

        DeliveryStatus status2 = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Order is out for delivery.");
            }
        };

        status1.updateStatus();
        status2.updateStatus();
    }
}