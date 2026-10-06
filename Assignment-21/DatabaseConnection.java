import java.sql.*;
public class DatabaseConnection{
    public static void main(String[] args){
        // Database connection details
        String url="jdbc:mysql://localhost:3306/college";
        String username="root";
        String password="root@12345";
        try{
            // Establish database connection
            Connection con=DriverManager.getConnection(url,username,password);
            // Display connection status
            if(con!=null){
                System.out.println("Database connected successfully.");
            }
            // Close connection
            con.close();
        }
        catch(SQLException e){
            System.out.println("Database connection failed.");
            System.out.println("Error: "+e.getMessage());
        }
    }
}