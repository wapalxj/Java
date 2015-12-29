package Swing_07_1_Main_Thread;
/*
 * 代码编写合理:线程安全
 */
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Right1 {

	public static void main(String[] args) {
		/*
		 * SwingUtilities和EventQueue完全相同
		 */
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame();
				frame.setTitle("frame");
				frame.setSize(500, 200);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}
