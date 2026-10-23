import java.rmi.*;
import java.rmi.server.*;
public class TemperatureImplementation extends UnicastRemoteObject implements TemperatureService{
    public TemperatureImplementation()throws RemoteException{
        super();
    }
    public double celsiusToFahrenheit(double celsius)throws RemoteException{
        return (celsius*9/5)+32;
    }
    public double fahrenheitToCelsius(double fahrenheit)throws RemoteException{
        return (fahrenheit-32)*5/9;
    }
}