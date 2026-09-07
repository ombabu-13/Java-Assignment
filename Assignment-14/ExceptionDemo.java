public class ExceptionDemo{
    public static void main(String[] args){
        // Simple try-catch
        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Simple Catch: Cannot divide by zero.");
        }
        // Nested try-catch
        try{
            System.out.println("Outer Try Block");
            try{
                int arr[]={10,20,30};
                System.out.println(arr[5]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Nested Catch: Array index is invalid.");
            }
        }
        catch(Exception e){
            System.out.println("Outer Catch: Exception occurred.");
        }
        // Multiple catch blocks
        try{
            int num=Integer.parseInt("ABC");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Multiple Catch: Invalid number format.");
        }
        catch(Exception e){
            System.out.println("Multiple Catch: Some other exception occurred.");
        }
    }
}