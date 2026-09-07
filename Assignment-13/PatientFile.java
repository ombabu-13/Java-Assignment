import java.io.*;

public class PatientFile{
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("patient.txt");
            writer.write("Patient 1\nID: 101\nName: Ombabu Rauniyar\nAge: 20\nDiagnosis: Fever\n\n");
            writer.write("Patient 2\nID: 102\nName: Rahul Sharma\nAge: 22\nDiagnosis: Cold\n\n");
            writer.write("Patient 3\nID: 103\nName: Aryan Singh\nAge: 25\nDiagnosis: Headache\n\n");
            writer.write("Patient 4\nID: 104\nName: Rohan Patil\nAge: 21\nDiagnosis: Cough\n");
            writer.close();

            FileReader reader=new FileReader("patient.txt");
            int ch;
            System.out.println("Patient Details:");
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