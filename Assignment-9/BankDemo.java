class BankAccount {
    final long accountNumber = 1234567890L;
    String accountHolder = "Ombabu";
    double balance = 50000;

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.displayAccount();

        // account.accountNumber = 9876543210L;
        // Error: cannot change the value of a final variable
    }
}