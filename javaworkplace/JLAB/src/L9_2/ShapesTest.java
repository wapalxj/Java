package L9_2;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				ShapesFrame frame = new ShapesFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setVisible(true);
			}	
		}); 
		System.out.println("20121120012 ÄÂ¹ðº£");
	} 
}
