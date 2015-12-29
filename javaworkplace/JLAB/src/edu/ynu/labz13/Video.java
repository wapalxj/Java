package edu.ynu.labz13;

import java.awt.*;
import javax.swing.*;
public class Video extends JApplet{
	public void init(){
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run() {
				VideoFrame frame =new VideoFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
			
	}
}