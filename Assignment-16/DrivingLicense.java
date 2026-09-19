import java.util.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class DrivingLicense{
    static void checkEligibility(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("You are not eligible for a driving license. Age must be 18 or above.");
        }
        System.out.println("You are eligible for a driving license.");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter your age: ");
            int age=sc.nextInt();
            checkEligibility(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}