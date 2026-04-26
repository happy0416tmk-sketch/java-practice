import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame {

    private JTextField display;
    private int num1 = 0;

    public CalculatorGUI() {
        setTitle("電卓");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 30));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,3));

        for (int i = 1; i <= 9; i++){
            int num = i;
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(e ->
display.setText(display.getText() + num));
        panel.add(btn);
        }

        JButton zero = new JButton("0");
        zero.addActionListener(e ->
display.setText(display.getText() + "0"));
        panel.add(zero);

        JButton plus = new JButton("+");
        plus.addActionListener(e ->{
            num1 = Integer.parseInt(display.getText());
            display.setText("");
        });
        panel.add(plus);

        JButton equal = new JButton("=");
        equal.addActionListener(e -> {
            int num2 = Integer.parseInt(display.getText());
            int result = num1 + num2;
            display.setText(String.valueOf(result));
        });
        panel.add(equal);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}