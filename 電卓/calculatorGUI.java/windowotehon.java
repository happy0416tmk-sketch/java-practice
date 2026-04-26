import javax.swing.JFrame;

public class windowotehon {
    public static void main(String[] args) {
        // 1. ウィンドウ（フレーム）を作成します
        JFrame frame = new JFrame("はじめてのJavaウィンドウ");

        // 2. ウィンドウのサイズを設定します（幅, 高さ）
        frame.setSize(400, 300);

        // 3. 【必須】×ボタンが押された時にプログラムを完全に終了するようにします
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4. ウィンドウを画面の中央に表示する設定（お好みで）
        frame.setLocationRelativeTo(null);

        // 5. ウィンドウを可視化（表示）します
        frame.setVisible(true);
    }
}