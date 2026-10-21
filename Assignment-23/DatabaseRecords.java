import java.sql.*;
public class DatabaseRecords{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/college";
        String username="root";
        String password="root@12345";
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM student");
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Course: "+rs.getString("course"));
                System.out.println("Marks: "+rs.getInt("marks"));
                System.out.println("--------------------");
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println("Database Error: "+e.getMessage());
        }
    }
}