package edu.ynu.labz11;

import java.awt.*;
import javax.swing.*;
public class Video {
	public static void main(String[] args){
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