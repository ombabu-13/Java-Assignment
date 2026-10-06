import java.sql.*;
import java.util.*;
public class StudentManagement{
    static String url="jdbc:mysql://localhost:3306/student_db";
    static String username="root";
    static String password="root@12345";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("1. Create Student");
            System.out.println("2. Read Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.print("Enter Roll Number: ");
                int roll=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name=sc.nextLine();
                System.out.print("Enter Course: ");
                String course=sc.nextLine();
                System.out.print("Enter Marks: ");
                int marks=sc.nextInt();
                String query="INSERT INTO student VALUES(?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setInt(1,roll);
                ps.setString(2,name);
                ps.setString(3,course);
                ps.setInt(4,marks);
                ps.executeUpdate();
                System.out.println("Student added successfully.");
                ps.close();
            }
            else if(choice==2){
                String query="SELECT * FROM student";
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(query);
                System.out.println("\nStudent Records:");
                System.out.println("-------------------------");
                while(rs.next()){
                    System.out.println("Roll Number: "+rs.getInt("roll_no"));
                    System.out.println("Name: "+rs.getString("name"));
                    System.out.println("Course: "+rs.getString("course"));
                    System.out.println("Marks: "+rs.getInt("marks"));
                    System.out.println("-------------------------");
                }
                rs.close();
                stmt.close();
            }
            else if(choice==3){
                System.out.print("Enter Roll Number to update: ");
                int roll=sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Name: ");
                String name=sc.nextLine();

                System.out.print("Enter New Course: ");
                String course=sc.nextLine();

                System.out.print("Enter New Marks: ");
                int marks=sc.nextInt();

                String query="UPDATE student SET name=?,course=?,marks=? WHERE roll_no=?";
                PreparedStatement ps=con.prepareStatement(query);

                ps.setString(1,name);
                ps.setString(2,course);
                ps.setInt(3,marks);
                ps.setInt(4,roll);

                int rows=ps.executeUpdate();

                if(rows>0)
                    System.out.println("Student updated successfully.");
                else
                    System.out.println("Student not found.");

                ps.close();
            }
            else if(choice==4){
                System.out.print("Enter Roll Number to delete: ");
                int roll=sc.nextInt();
                String query="DELETE FROM student WHERE roll_no=?";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setInt(1,roll);
                int rows=ps.executeUpdate();
                if(rows>0)
                    System.out.println("Student deleted successfully.");
                else
                    System.out.println("Student not found.");
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