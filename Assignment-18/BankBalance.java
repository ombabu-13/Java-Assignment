import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BankBalance{
    public static void main(String[] args){
        // Create the main window
        JFrame frame=new JFrame("Bank Balance Calculator");
        frame.setLayout(new GridLayout(5,2,10,10));
        // Create labels
        JLabel initialLabel=new JLabel("Initial Balance:");
        JLabel transactionLabel=new JLabel("Transaction Amount:");
        JLabel balanceLabel=new JLabel("Updated Balance:");
        // Create text fields
        JTextField initialField=new JTextField();
        JTextField transactionField=new JTextField();
        JTextField balanceField=new JTextField();
        // Create buttons
        JButton depositButton=new JButton("Deposit");
        JButton withdrawButton=new JButton("Withdraw");
        // Add components to the frame
        frame.add(initialLabel);
        frame.add(initialField);
        frame.add(transactionLabel);
        frame.add(transactionField);
        frame.add(depositButton);
        frame.add(withdrawButton);
        frame.add(balanceLabel);
        frame.add(balanceField);
        // Perform deposit operation
        depositButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double initial=Double.parseDouble(initialField.getText());
                double amount=Double.parseDouble(transactionField.getText());
                double balance=initial+amount;
                balanceField.setText("₹"+balance);
            }
        });
        withdrawButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double initial=Double.parseDouble(initialField.getText());
                double amount=Double.parseDouble(transactionField.getText());
                double balance=initial-amount;
                if(balance<0){
                    JOptionPane.showMessageDialog(frame,"Insufficient Balance!");
                }
                else{
                    balanceField.setText("₹"+balance);
                }
            }
        });
        frame.setSize(450,220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}