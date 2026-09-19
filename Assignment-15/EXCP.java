class InvalidAgeException extends java.lang.Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class EXCP {

    static void validate(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Valid age to vote: " + age);
        }
    }

    public static void main(String[] args) {

        try {
            validate(13);
        }
        catch (InvalidAgeException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}