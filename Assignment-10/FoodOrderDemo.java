abstract class FoodOrder {
    double amount;
    FoodOrder(double amount) {
        this.amount = amount;
    }
    abstract void calculateBill();
}
class DineInOrder extends FoodOrder {
    DineInOrder(double amount) {
        super(amount);
    }
    void calculateBill() {
        double bill = amount + (amount * 0.05); // 5% service charge
        System.out.println("Dine-In Bill: ₹" + bill);
    }
}
class TakeAwayOrder extends FoodOrder {
    TakeAwayOrder(double amount) {
        super(amount);
    }
    void calculateBill() {
        double bill = amount + 30; // Packing charge
        System.out.println("Take-Away Bill: ₹" + bill);
    }
}
public class FoodOrderDemo {
    public static void main(String[] args) {
        FoodOrder dineIn = new DineInOrder(1000);
        FoodOrder takeAway = new TakeAwayOrder(1000);
        dineIn.calculateBill();
        takeAway.calculateBill();
    }
}