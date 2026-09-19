import java.awt.*;
import javax.swing.*;
public class AppletDemo extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Name: Ombabu Rauniyar", 50, 50);
        g.drawString("PRN: 25070122128", 50, 70);
        g.drawString("Course: Computer Science", 50, 90);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Information");
        frame.add(new AppletDemo());
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}