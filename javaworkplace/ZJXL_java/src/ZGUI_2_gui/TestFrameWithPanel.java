package ZGUI_2_gui;

import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JPanel;


public class TestFrameWithPanel {

	
	public static void main(String[] args) {
		JFrame frame=new JFrame("Use Panel in Frame");
		JPanel panel=new JPanel();
		frame.setSize(300,200);
		frame.setBackground(Color.cyan);
		frame.setLayout(null);//完全手工定位
		panel.setSize(80,80);
		panel.setBackground(Color.blue);
		frame.add(panel);
		panel.setLocation(40,40);
		frame.setLocation(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
 