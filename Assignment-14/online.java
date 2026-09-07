import java.util.*;
public class online{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] products={"Wireless Headphones","Smart Watch","Bluetooth Speaker","Power Bank"};
        double[] prices={1500,2500,1800,1200};
        System.out.println("Available Products:");
        for(int i=0;i<products.length;i++){
            System.out.println((i+1)+". "+products[i]+" - $"+prices[i]);
        }
        try{
            System.out.print("Enter product number: ");
            int choice=sc.nextInt();
            if(choice<1||choice>products.length){
                throw new IllegalArgumentException("Invalid product number.");
            }
            System.out.print("Enter product quantity: ");
            int quantity=sc.nextInt();
            if(quantity<=0){
                throw new IllegalArgumentException("Quantity must be greater than zero.");
            }
            double total=prices[choice-1]*quantity;
            System.out.println("Product: "+products[choice-1]);
            System.out.println("Price: ₹"+prices[choice-1]);
            System.out.println("Quantity: "+quantity);
            System.out.println("Total Amount: ₹"+total);
            System.out.println("Order placed successfully.");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Error: Please enter a valid number.");
        }
    }
}