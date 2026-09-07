import java.io.*;

public class FileHandling{
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("student.txt");
            writer.write("Student Name: Ombabu Rauniyar\n");
            writer.write("PRN: 25070122128\n");
            writer.write("Course: Computer Science");
            writer.close();

            FileReader reader=new FileReader("student.txt");
            int ch;
            System.out.println("File Content:");
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