import javax.swing.*;
import java.awt.*;

public class text extends JFrame {
    public text () {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("テキスト");
        setSize(400, 400);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("ここにテキストが表示されます");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("表示する");

        button.addActionListener(e -> {
            label.setText(textField.getText());
        });

        add(label);
        add(textField);
        add(button);

        setVisible(true);
       
    }

    public static void main(String[] args) {
        new text();
    }
}