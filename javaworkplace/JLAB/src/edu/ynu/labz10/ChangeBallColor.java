package edu.ynu.labz10;

import java.awt.*;
import javax.swing.*; 
public class ChangeBallColor {    

	 public static void main(String[] args) {  
		 EventQueue.invokeLater(new Runnable(){           
			 public void run(){ChangeColorFrame frame = new ChangeColorFrame();
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 frame.setVisible(true);
			 }         
		}); 
	
	} 
}

