import java.rmi.*;
import java.util.*;
public class CalculatorClient{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            CalculatorService service=(CalculatorService)Naming.lookup("rmi://localhost/CalculatorService");
            System.out.print("Enter first number: ");
            double a=sc.nextDouble();
            System.out.print("Enter second number: ");
            double b=sc.nextDouble();
            System.out.println("Addition: "+service.add(a,b));
            System.out.println("Subtraction: "+service.subtract(a,b));
            System.out.println("Multiplication: "+service.multiply(a,b));
            try{
                System.out.println("Division: "+service.divide(a,b));
            }
            catch(RemoteException e){
                System.out.println(e.getMessage());
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println("Client Error: "+e.getMessage());
        }
    }
}