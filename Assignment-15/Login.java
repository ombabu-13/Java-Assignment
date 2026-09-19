import java.util.*;
public class Login{
    static void login(String password){
        String correctPassword="Ombabu123";
        if(!password.equals(correctPassword)){
            throw new IllegalArgumentException("Invalid password.");
        }
        System.out.println("Login successful.");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter password: ");
            String password=sc.nextLine();
            login(password);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Login process completed.");
        }
    }
}