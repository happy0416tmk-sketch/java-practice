import javax.swing.*;
import java.awt.*;

public class window extends JFrame{
    public window() {

        setSize(400, 200);
        setTitle("ウィンドウだよ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());

    
    }

    public static void main(String[] argl) {
        new window();
    }
}
