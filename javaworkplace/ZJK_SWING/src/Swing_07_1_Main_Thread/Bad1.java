package Swing_07_1_Main_Thread;
/*���߳���UI�̣߳�
 * �����д���������������߳��д������޸�UIԪ��
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
