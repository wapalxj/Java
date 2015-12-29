package edu.ynu.labz13;

import java.awt.EventQueue;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloApplet extends JApplet{

	public void init(){
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				JFrame frame =new JFrame();
				JLabel lab1=new JLabel("qqqqqqqqqqq");
				add(lab1);
			}
		});
			
	}
}
