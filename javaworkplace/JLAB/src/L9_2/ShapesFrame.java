package L9_2;

import javax.swing.JFrame;


public class ShapesFrame extends JFrame {
	public ShapesFrame()
	{
		setTitle("drawGraphics");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		ShapesPanel panel = new ShapesPanel();
        add(panel);
	}
	private static final int DEFAULT_WIDTH = 450;
	private static final int DEFAULT_HEIGHT = 450;
}
