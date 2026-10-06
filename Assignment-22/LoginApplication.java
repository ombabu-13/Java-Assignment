import java.sql.*;
import java.util.*;
public class LoginApplication{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/student_db";
        String username="root";
        String password="root@12345";
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.print("Enter username: ");
            String user=sc.nextLine();
            System.out.print("Enter password: ");
            String pass=sc.nextLine();
            // Use PreparedStatement to safely check login details
            String query="SELECT * FROM login WHERE username=? AND password=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,pass);
            // ResultSet stores the result of the SELECT query
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("Login successful.");
            }
            else{
                System.out.println("Invalid username or password.");
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