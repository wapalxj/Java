package Swing_07_1_Main_Thread;
/*主线程与UI线程：
 * 代码编写不合理：不能再主线程中创建或修改UI元素
 */
import javax.swing.JFrame;
import Swing_06_2_Menu.MyFrame;

public class Bad1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("frame");
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
