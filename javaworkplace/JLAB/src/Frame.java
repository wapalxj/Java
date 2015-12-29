import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.ynu.lab9.NamesFrame;


public class Frame extends JFrame {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				Frame f  = new Frame ();
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            f.setVisible(true);
	            f.setTitle("11111");
			}	
		}); 
	}
	
	public Frame() {
	super();
	this.setSize(400,300);
	JPanel myp =new JPanel(){
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(new Color(255,0,0));
			g.setFont(new Font(null, 30, 30));
			g.drawString("你确定要退出吗？", 100, 100);
			}
	};
	this.add(myp);
	}
}



