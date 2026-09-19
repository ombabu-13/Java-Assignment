import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StudentRegistration{
    public static void main(String[] args){
        JFrame frame=new JFrame("Student Registration Form"); // Create the main window
        frame.setLayout(new GridLayout(4,2,10,10));
        JLabel nameLabel=new JLabel("Name:");   // Create labels
        JLabel prnLabel=new JLabel("PRN:");
        JLabel courseLabel=new JLabel("Course:");
        JTextField nameField=new JTextField();  // Create text fields
        JTextField prnField=new JTextField();
        JTextField courseField=new JTextField();
        JButton button=new JButton("Register");   // Create register button
        frame.add(nameLabel);      // Add components to the frame
        frame.add(nameField);
        frame.add(prnLabel);
        frame.add(prnField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(new JLabel());
        frame.add(button);
        button.addActionListener(new ActionListener(){        // Display entered information when button is clicked
            public void actionPerformed(ActionEvent e){
                String details="Name: "+nameField.getText()+
                        "\nPRN: "+prnField.getText()+
                        "\nCourse: "+courseField.getText();
                JOptionPane.showMessageDialog(frame,details,"Student Details",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.setSize(400,200);  // Set window properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}