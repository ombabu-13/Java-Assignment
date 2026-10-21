import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class BookIssueGUI extends JFrame{
    JTextField issueId=new JTextField(15);
    JTextField bookId=new JTextField(15);
    JTextField studentName=new JTextField(15);
    JTextField issueDate=new JTextField(15);
    JTextField returnDate=new JTextField(15);
    JTextArea output=new JTextArea(10,35);
    String url="jdbc:mysql://localhost:3306/bookissue_db";
    String username="root";
    String password="root@12345";
    BookIssueGUI(){
        setTitle("Book Issue Tracking System");
        setSize(550,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel("Issue ID:"));
        add(issueId);
        add(new JLabel("Book ID:"));
        add(bookId);
        add(new JLabel("Student Name:"));
        add(studentName);
        add(new JLabel("Issue Date (YYYY-MM-DD):"));
        add(issueDate);
        add(new JLabel("Return Date (YYYY-MM-DD):"));
        add(returnDate);
        JButton addBtn=new JButton("Issue Book");
        JButton viewBtn=new JButton("View Records");
        JButton updateBtn=new JButton("Update Record");
        JButton deleteBtn=new JButton("Delete Record");
        add(addBtn);
        add(viewBtn);
        add(updateBtn);
        add(deleteBtn);
        output.setEditable(false);
        add(new JScrollPane(output));
        addBtn.addActionListener(e->addRecord());
        viewBtn.addActionListener(e->viewRecords());
        updateBtn.addActionListener(e->updateRecord());
        deleteBtn.addActionListener(e->deleteRecord());
        setVisible(true);
    }
    void addRecord(){
        try(Connection con=DriverManager.getConnection(url,username,password)){
            String q="INSERT INTO book_issue VALUES(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,Integer.parseInt(issueId.getText()));
            ps.setInt(2,Integer.parseInt(bookId.getText()));
            ps.setString(3,studentName.getText());
            ps.setDate(4,Date.valueOf(issueDate.getText()));
            ps.setDate(5,Date.valueOf(returnDate.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Book issue record added successfully.");
            viewRecords();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }
    void viewRecords(){
        output.setText("");
        try(Connection con=DriverManager.getConnection(url,username,password)){
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM book_issue");
            while(rs.next()){
                output.append("Issue ID: "+rs.getInt("issue_id")+"\n");
                output.append("Book ID: "+rs.getInt("book_id")+"\n");
                output.append("Student: "+rs.getString("student_name")+"\n");
                output.append("Issue Date: "+rs.getDate("issue_date")+"\n");
                output.append("Return Date: "+rs.getDate("return_date")+"\n");
                output.append("------------------------\n");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }
    void updateRecord(){
        try(Connection con=DriverManager.getConnection(url,username,password)){
            String q="UPDATE book_issue SET book_id=?,student_name=?,issue_date=?,return_date=? WHERE issue_id=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,Integer.parseInt(bookId.getText()));
            ps.setString(2,studentName.getText());
            ps.setDate(3,Date.valueOf(issueDate.getText()));
            ps.setDate(4,Date.valueOf(returnDate.getText()));
            ps.setInt(5,Integer.parseInt(issueId.getText()));
            int rows=ps.executeUpdate();
            JOptionPane.showMessageDialog(this,rows>0?"Record updated successfully.":"Record not found.");
            viewRecords();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }
    void deleteRecord(){
        try(Connection con=DriverManager.getConnection(url,username,password)){
            PreparedStatement ps=con.prepareStatement("DELETE FROM book_issue WHERE issue_id=?");
            ps.setInt(1,Integer.parseInt(issueId.getText()));
            int rows=ps.executeUpdate();
            JOptionPane.showMessageDialog(this,rows>0?"Record deleted successfully.":"Record not found.");
            viewRecords();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new BookIssueGUI());
    }
}