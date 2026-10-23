import java.rmi.registry.*;
import java.rmi.*;
public class CalculatorServer{
    public static void main(String[] args){
        try{
            LocateRegistry.createRegistry(1099);
            CalculatorService service=new CalculatorImplementation();
            Naming.rebind("rmi://localhost/CalculatorService",service);
            System.out.println("Calculator Server is running...");
        }
        catch(Exception e){
            System.out.println("Server Error: "+e.getMessage());
        }
    }
}