import java.sql.*;
public class StudentDatabase{
    public static void main(String[] args){
        // Database connection details
        String url="jdbc:mysql://localhost:3306/college";
        String username="root";
        String password="root@12345";
        try{
            // Establish connection with database
            Connection con=DriverManager.getConnection(url,username,password);
            // Create SQL SELECT query
            String query="SELECT * FROM student";
            // Create statement
            Statement stmt=con.createStatement();
            // Execute SELECT query
            ResultSet rs=stmt.executeQuery(query);
            // Display student records
            System.out.println("Student Records:");
            System.out.println("------------------------------");
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Course: "+rs.getString("course"));
                System.out.println("Marks: "+rs.getInt("marks"));
                System.out.println("------------------------------");
            }
            // Close database connection
            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println("Database Error: "+e.getMessage());
        }
    }
}