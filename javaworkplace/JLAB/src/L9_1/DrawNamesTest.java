package L9_1;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class DrawNamesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				NamesFrame frame = new NamesFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setVisible(true);
			}	
		}); 
		System.out.println("20121120138ÄÂ¹ðº£");
	}
	
}
