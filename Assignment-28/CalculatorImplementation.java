import java.rmi.*;
import java.rmi.server.*;
public class CalculatorImplementation extends UnicastRemoteObject implements CalculatorService{
    public CalculatorImplementation()throws RemoteException{
        super();
    }
    public double add(double a,double b)throws RemoteException{
        return a+b;
    }
    public double subtract(double a,double b)throws RemoteException{
        return a-b;
    }
    public double multiply(double a,double b)throws RemoteException{
        return a*b;
    }
    public double divide(double a,double b)throws RemoteException{
        if(b==0)throw new RemoteException("Cannot divide by zero.");
        return a/b;
    }
}