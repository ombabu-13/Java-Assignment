import java.sql.*;
import java.util.*;
public class EmployeeManagement{
    static String url="jdbc:mysql://localhost:3306/employee_db";
    static String username="root";
    static String password="root@12345";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("1. Create Employee");
            System.out.println("2. Read Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.print("Enter your choice: ");

            int choice=sc.nextInt();
            sc.nextLine();

            if(choice==1){
                System.out.print("Enter Employee ID: ");
                int id=sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name=sc.nextLine();

                System.out.print("Enter Department: ");
                String department=sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary=sc.nextDouble();

                String query="INSERT INTO employee VALUES(?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(query);

                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setString(3,department);
                ps.setDouble(4,salary);

                ps.executeUpdate();

                System.out.println("Employee added successfully.");
                ps.close();
            }
            else if(choice==2){
                String query="SELECT * FROM employee";
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(query);

                System.out.println("\nEmployee Records:");
                System.out.println("-------------------------");

                while(rs.next()){
                    System.out.println("Employee ID: "+rs.getInt("emp_id"));
                    System.out.println("Name: "+rs.getString("name"));
                    System.out.println("Department: "+rs.getString("department"));
                    System.out.println("Salary: ₹"+rs.getDouble("salary"));
                    System.out.println("-------------------------");
                }

                rs.close();
                stmt.close();
            }
            else if(choice==3){
                System.out.print("Enter Employee ID to update: ");
                int id=sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Name: ");
                String name=sc.nextLine();

                System.out.print("Enter New Department: ");
                String department=sc.nextLine();

                System.out.print("Enter New Salary: ");
                double salary=sc.nextDouble();

                String query="UPDATE employee SET name=?,department=?,salary=? WHERE emp_id=?";
                PreparedStatement ps=con.prepareStatement(query);

                ps.setString(1,name);
                ps.setString(2,department);
                ps.setDouble(3,salary);
                ps.setInt(4,id);

                int rows=ps.executeUpdate();

                if(rows>0)
                    System.out.println("Employee updated successfully.");
                else
                    System.out.println("Employee not found.");

                ps.close();
            }
            else if(choice==4){
                System.out.print("Enter Employee ID to delete: ");
                int id=sc.nextInt();

                String query="DELETE FROM employee WHERE emp_id=?";
                PreparedStatement ps=con.prepareStatement(query);

                ps.setInt(1,id);

                int rows=ps.executeUpdate();

                if(rows>0)
                    System.out.println("Employee deleted successfully.");
                else
                    System.out.println("Employee not found.");

                ps.close();
            }
            else{
                System.out.println("Invalid choice.");
            }

            con.close();
        }
        catch(SQLException e){
            System.out.println("Database Error: "+e.getMessage());
        }
    }
}