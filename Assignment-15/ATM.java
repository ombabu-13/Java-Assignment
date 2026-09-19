import java.util.*;
public class ATM{
    static void verifyPIN(int pin){
        int correctPIN=1234;
        if(pin!=correctPIN){
            throw new IllegalArgumentException("Invalid PIN.");
        }
        System.out.println("PIN verified successfully.");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter ATM PIN: ");
            int pin=sc.nextInt();
            verifyPIN(pin);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("PIN verification process completed.");
        }
    }
}