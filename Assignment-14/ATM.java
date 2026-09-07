import java.util.*;
public class ATM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double balance=50000;
        try{
            System.out.print("Enter withdrawal amount: ");
            double amount=sc.nextDouble();
            if(amount<=0){
                throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
            }
            if(amount>balance){
                throw new IllegalArgumentException("Insufficient balance.");
            }
            balance=balance-amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: $"+balance);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Error: Please enter a valid amount.");
        }
    }
}