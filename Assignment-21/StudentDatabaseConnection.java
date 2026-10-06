import java.sql.*;

public class StudentDatabaseConnection{
    public static void main(String[] args){
        // Student database connection details
        String url="jdbc:mysql://localhost:3306/student_db";
        String username="root";
        String password="root@12345";

        try{
            // Establish connection with Student database
            Connection con=DriverManager.getConnection(url,username,password);

            // Check connection status
            if(con!=null){
                System.out.println("Student database connected successfully.");
            }

            // Close database connection
            con.close();
        }
        catch(SQLException e){
            System.out.println("Student database connection failed.");
            System.out.println("Error: "+e.getMessage());
        }
    }
}