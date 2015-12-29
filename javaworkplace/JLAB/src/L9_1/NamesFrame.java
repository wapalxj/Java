package L9_1;

import javax.swing.JFrame;

public class NamesFrame extends JFrame {
	public NamesFrame()
	{
		setTitle("PrintNames");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		NamesPanel panel = new NamesPanel();
        add(panel);
	}
	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 600;
}
