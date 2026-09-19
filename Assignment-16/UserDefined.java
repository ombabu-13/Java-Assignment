class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class UserDefined{
    static void checkAge(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Eligible for registration.");
    }
    public static void main(String[] args){
        try{
            int age=20;
            System.out.println("Age: "+age);
            checkAge(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}