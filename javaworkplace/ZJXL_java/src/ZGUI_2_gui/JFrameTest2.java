package ZGUI_2_gui;
/*
 * 从Jframe派生
 */
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class MyFrame extends JFrame {
    public MyFrame() {
        super();
        init();
    }

    public MyFrame(String title) {
        super(title);
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点X则停止程序，而不是隐藏窗口
        this.setTitle("JFrame Test");
        this.setLayout(new GridLayout(3, 2));
        this.add(new JLabel("First Name:"));
        this.add(new JTextField());
        this.add(new JLabel("Last Name:"));
        this.add(new JTextField());
        this.add(new JButton("Register"));
        int frameWidth = 200;
        int frameHeight = 100;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds((int) screenSize.getWidth() - frameWidth, 0, frameWidth,
                frameHeight);
    }
}

public class JFrameTest2 {

    private static void constructGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                constructGUI();
            }
        });
    }
}
