import java.sql.*;
public class EmployeeRecords{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/employee_db";
        String username="root";
        String password="root@12345";
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM employee");
            System.out.println("Employee Records:");
            System.out.println("--------------------");
            while(rs.next()){
                System.out.println("Employee ID: "+rs.getInt("emp_id"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Department: "+rs.getString("department"));
                System.out.println("Salary: "+rs.getDouble("salary"));
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