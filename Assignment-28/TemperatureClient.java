import java.rmi.*;
import java.util.*;
public class TemperatureClient{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            TemperatureService service=(TemperatureService)Naming.lookup("rmi://localhost/TemperatureService");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            System.out.print("Enter temperature: ");
            double temperature=sc.nextDouble();
            if(choice==1){
                System.out.println("Temperature in Fahrenheit: "+service.celsiusToFahrenheit(temperature));
            }
            else if(choice==2){
                System.out.println("Temperature in Celsius: "+service.fahrenheitToCelsius(temperature));
            }
            else{
                System.out.println("Invalid choice.");
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println("Client Error: "+e.getMessage());
        }
    }
}