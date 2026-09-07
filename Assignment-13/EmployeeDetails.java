import java.io.*;
public class EmployeeDetails{
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("employee.txt");
            writer.write("Employee Name: Ombabu Rauniyar\n");
            writer.write("Employee ID: 101\n");
            writer.write("Salary: 50000");
            writer.write("\n");
            writer.write("Employee Name: Amol Kamble\n");
            writer.write("Employee ID: 102\n");
            writer.write("Salary: 5000000");
            writer.close();

            FileReader reader=new FileReader("employee.txt");
            int ch;
            System.out.println("Employee Details:");
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}