import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class LibraryManagementGUI extends JFrame{
    JTextField id=new JTextField(15);
    JTextField title=new JTextField(15);
    JTextField author=new JTextField(15);
    JTextField price=new JTextField(15);
    JTextArea output=new JTextArea(10,35);
    String url="jdbc:mysql://localhost:3306/library_db";
    String username="root";
    String password="root@12345";
    LibraryManagementGUI(){
        setTitle("Library Management System");
        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel("Book ID:"));
        add(id);
        add(new JLabel("Title:"));
        add(title);
        add(new JLabel("Author:"));
        add(author);
        add(new JLabel("Price:"));
        add(price);
        JButton addBtn=new JButton("Add Book");
        JButton viewBtn=new JButton("View Books");
        JButton updateBtn=new JButton("Update Book");
        JButton deleteBtn=new JButton("Delete Book");
        add(addBtn);
        add(viewBtn);
        add(updateBtn);
        add(deleteBtn);
        output.setEditable(false);
        add(new JScrollPane(output));
        addBtn.addActionListener(e->addBook());
        viewBtn.addActionListener(e->viewBooks());
        updateBtn.addActionListener(e->updateBook());
        deleteBtn.addActionListener(e->deleteBook());
        setVisible(true);
    }
    void addBook(){
        try(Connection con=DriverManager.getConnection(url,username,password)){
            String q="INSERT INTO books VALUES(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,Integer.parseInt(id.getText()));
            ps.setString(2,title.getText());
            ps.setString(3,author.getText());
            ps.setDouble(4,Double.parseDouble(price.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Book added successfully.");
            viewBooks();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }
    void viewBooks(){
        output.setText("");
        try(Connection con=DriverManager.getConnection(url,username,password)){
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM books");
            while(rs.next()){
                output.append("Book ID: "+rs.getInt("book_id")+"\n");
                output.append("Title: "+rs.getString("title")+"\n");
                output.append("Author: "+rs.getString("author")+"\n");
                output.append("Price: Rs. "+rs.getDouble("price")+"\n");
                output.append("------------------------\n");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }
    void updateBook(){
        try(Connection con=DriverManager.getConnection(url,username,password)){
            String q="UPDATE books SET title=?,author=?,price=? WHERE book_id=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1,title.getText());
            ps.setString(2,author.getText());
            ps.setDouble(3,Double.parseDouble(price.getText()));
            ps.setInt(4,Integer.parseInt(id.getText()));
            int rows=ps.executeUpdate();
            JOptionPane.showMessageDialog(this,rows>0?"Book updated successfully.":"Book not found.");
            viewBooks();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }
    void deleteBook(){
        try(Connection con=DriverManager.getConnection(url,username,password)){
            PreparedStatement ps=con.prepareStatement("DELETE FROM books WHERE book_id=?");
            ps.setInt(1,Integer.parseInt(id.getText()));
            int rows=ps.executeUpdate();
            JOptionPane.showMessageDialog(this,rows>0?"Book deleted successfully.":"Book not found.");
            viewBooks();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new LibraryManagementGUI());
    }
}