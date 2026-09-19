import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator{
    public static void main(String[] args){
        // Create the main window
        JFrame frame=new JFrame("Simple Calculator");
        frame.setLayout(new GridLayout(4,2,10,10));
        // Create labels and text fields
        JLabel num1Label=new JLabel("First Number:");
        JLabel num2Label=new JLabel("Second Number:");
        JLabel resultLabel=new JLabel("Result:");
        JTextField num1Field=new JTextField();
        JTextField num2Field=new JTextField();
        JTextField resultField=new JTextField();
        // Create buttons
        JButton addButton=new JButton("Addition");
        JButton subButton=new JButton("Subtraction");
        // Add components to the frame
        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(resultLabel);
        frame.add(resultField);
        // Perform addition when Addition button is clicked
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a=Double.parseDouble(num1Field.getText());
                double b=Double.parseDouble(num2Field.getText());
                resultField.setText(String.valueOf(a+b));
            }
        });
        // Perform subtraction when Subtraction button is clicked
        subButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a=Double.parseDouble(num1Field.getText());
                double b=Double.parseDouble(num2Field.getText());
                resultField.setText(String.valueOf(a-b));
            }
        });
        // Set window properties
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}