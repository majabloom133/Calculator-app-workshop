import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("My first GUI calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // Create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new

                FlowLayout());

        // Add text frame and a button
        JLabel label = new JLabel("Enter your number: ");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Calculate");

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
