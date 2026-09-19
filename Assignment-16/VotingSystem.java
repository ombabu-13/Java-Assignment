import java.util.*;
class UnderAgeException extends Exception{
    UnderAgeException(String message){
        super(message);
    }
}
public class VotingSystem{
    static void checkAge(int age)throws UnderAgeException{
        if(age<18){
            throw new UnderAgeException("You are not eligible to vote. Age must be 18 or above.");}
        System.out.println("You are eligible to vote.");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter your age: ");
            int age=sc.nextInt();
            checkAge(age);
        }
        catch(UnderAgeException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}