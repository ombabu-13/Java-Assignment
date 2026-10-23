import java.rmi.*;
import java.rmi.registry.*;
public class TemperatureServer{
    public static void main(String[] args){
        try{
            LocateRegistry.createRegistry(1099);
            TemperatureService service=new TemperatureImplementation();
            Naming.rebind("rmi://localhost/TemperatureService",service);
            System.out.println("Temperature Server is running...");
        }
        catch(Exception e){
            System.out.println("Server Error: "+e.getMessage());
        }
    }
}