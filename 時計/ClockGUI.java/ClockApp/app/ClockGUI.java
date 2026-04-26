import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockGUI extends JFrame {
    private JLabel label;

    public ClockGUI() {
        label = new JLabel("", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 48));
        add(label);
        getContentPane().setBackground(Color.BLACK);
        label.setForeground(Color.GREEN);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalTime now = LocalTime.now();
                label.setText(String.format("%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond()));
            }
        });
        timer.start();

        setTitle("デジタル時計");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClockGUI();
    }
}
