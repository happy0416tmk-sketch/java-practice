import javax.swing.*;
import java.awt.*;

public class textotehon extends JFrame {
    public textotehon() {
        setSize(400, 200);
        setTitle("ボタンとテキストの練習");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // テキスト表示
        JLabel label = new JLabel("ここにテキストが表示されます");

        // テキスト入力
        JTextField textField = new JTextField(20);

        // ボタン
        JButton button = new JButton("表示する");

        // ボタンを押したらlabelのテキストが変わる
        button.addActionListener(e -> {
            label.setText(textField.getText());
        });

        // ウィンドウに追加
        add(label);
        add(textField);
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new textotehon();
    }
}