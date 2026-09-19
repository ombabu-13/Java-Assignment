class ExceptionDemo{
    static void checkAge(int age)throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Age must be 18 or above.");
        }
        System.out.println("Eligible for registration.");
    }

    public static void main(String[] args){
        try{
            System.out.println("Checking age...");
            checkAge(20);
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Finally block executed.");
        }
    }
}