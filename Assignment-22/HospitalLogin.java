import java.sql.*;
import java.util.*;
public class HospitalLogin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/hospital_db";
        String username="root";
        String password="root@12345";
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.print("Enter Staff ID: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Staff Type (Doctor/Nurse): ");
            String type=sc.nextLine();
            System.out.print("Enter Password: ");
            String pass=sc.nextLine();
            // Use PreparedStatement for secure authentication
            String query="SELECT * FROM hospital_staff WHERE staff_id=? AND staff_type=? AND password=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,id);
            ps.setString(2,type);
            ps.setString(3,pass);
            // Retrieve authentication result
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("Login successful.");
                System.out.println("Welcome "+rs.getString("staff_type")+"!");
            }
            else{
                System.out.println("Invalid Staff ID, staff type, or password.");
            }
            rs.close();
            ps.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println("Database Error: "+e.getMessage());
        }
    }
}