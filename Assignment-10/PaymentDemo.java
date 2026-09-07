abstract class Payment {
    abstract void pay(double amount);

    void paymentMessage() {
        System.out.println("Payment Processing...");
    }
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        UPI upi = new UPI();

        card.paymentMessage();
        card.pay(5000);

        upi.paymentMessage();
        upi.pay(2500);
    }
}