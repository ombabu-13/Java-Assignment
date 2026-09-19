import javax.swing.*;
import java.awt.*;
public class SwingDemo{
    public static void main(String[] args){
        // Create the main window
        JFrame frame=new JFrame("Student Information");
        // Create labels to display student information
        JLabel name=new JLabel("Name: Ombabu Rauniyar");
        JLabel prn=new JLabel("PRN: 25070122128");
        JLabel course=new JLabel("Course: Computer Science");
        // Set the layout of the window
        frame.setLayout(new FlowLayout());
        // Add labels to the frame
        frame.add(name);
        frame.add(prn);
        frame.add(course);
        // Set window size
        frame.setSize(350,150);
        // Close the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make the window visible
        frame.setVisible(true);
    }
}