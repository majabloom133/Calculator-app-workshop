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
        panel.setLayout(new GridLayout(5, 2, 10, 10));


        JLabel label1 = new JLabel("First number: ");
        JTextField textField1 = new JTextField(10);

        JLabel label2 = new JLabel("Second number: ");
        JTextField textField2 = new JTextField(10);

        JButton addButton = new JButton(" + ");
        JButton subButton = new JButton(" - ");
        JButton mulButton = new JButton(" * ");
        JButton divButton = new JButton(" / ");


        // Add text frame and a button
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);

        frame.add(panel);

        // Listeners for buttons
        addButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());

                double num2 = Double.parseDouble(textField2.getText());

                double result = num1 + num2;

                JOptionPane.showMessageDialog(frame, "The sum is: " + result);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number!");
            }
        });

        subButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double result = num1 - num2;
                JOptionPane.showMessageDialog(frame, "Result: " + result);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error!");
            }
        });

        mulButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double result = num1 * num2;
                JOptionPane.showMessageDialog(frame, "Result: " + result);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error!");
            }
        });

        divButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(frame, "Error: Divide by zero!");
                } else {
                    double result = num1 / num2;
                    JOptionPane.showMessageDialog(frame, "Result: " + result);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        // Makes the frame visible
    frame.setVisible(true);
    }
}
