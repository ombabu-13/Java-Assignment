import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EmployeeRegistration{
    public static void main(String[] args){
        JFrame frame=new JFrame("Employee Registration Form");   // Create the main window
        frame.setLayout(new GridLayout(5,2,10,10));
        JLabel idLabel=new JLabel("Employee ID:");  // Create labels
        JLabel nameLabel=new JLabel("Name:");
        JLabel deptLabel=new JLabel("Department:");
        JLabel salaryLabel=new JLabel("Salary:"); 
        JTextField idField=new JTextField();  // Create text fields
        JTextField nameField=new JTextField();
        JTextField deptField=new JTextField();
        JTextField salaryField=new JTextField();
        // Create submit button
        JButton button=new JButton("Submit");
        // Add components to the frame
        frame.add(idLabel);
        frame.add(idField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(deptLabel);
        frame.add(deptField);
        frame.add(salaryLabel);
        frame.add(salaryField);
        frame.add(new JLabel());
        frame.add(button);
        // Display employee details in a dialog box
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String details="Employee ID: "+idField.getText()+
                        "\nName: "+nameField.getText()+
                        "\nDepartment: "+deptField.getText()+
                        "\nSalary: ₹"+salaryField.getText();

                JOptionPane.showMessageDialog(frame,details,"Employee Details",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        // Set window properties
        frame.setSize(450,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}