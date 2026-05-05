import javax.swing.*;
import java.awt.*;

public class text extends JFrame {
    public text () {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("テキスト");
        setSize(400, 200);
        setVisible(true);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("ここにテキストが表示されます");

        add(label);
        

        
    }

    public static void main(String[] args) {
        new text();
    }
}