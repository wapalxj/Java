
import java.awt.EventQueue;
import javax.swing.JApplet;
import javax.swing.JFrame;


public class ShapesTest extends JApplet {

	public void  init() {
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{

				ShapesPanel panel = new ShapesPanel();
		        add(panel);
			}	
		}); 
		System.out.println("20121120012 ÄÂ¹ðº£");
	} 
}
