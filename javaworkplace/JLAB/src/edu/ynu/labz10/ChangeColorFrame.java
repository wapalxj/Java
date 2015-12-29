package edu.ynu.labz10;

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class ChangeColorFrame extends JFrame{
		 private DrawBall drawball;  
		 private JButton blueButton;  
		 private JButton redButton; 
		 private static final int DEFAULT_WIDTH = 1024;
		 private static final int DEFAULT_HEIGHT = 960; 
	 
		 public ChangeColorFrame(){ 
			   setTitle("��ɫ�任"); 
			   setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);       
			   drawball = new DrawBall(); 
			   drawball.setColor(Color.WHITE);  //����Բ�ĳ�ʼ��ɫ       
			   
			   JPanel northPanel = new JPanel(); 
			   blueButton = new JButton();  //ʵ������ť   
			   redButton = new JButton();
			   blueButton.setText("blue");  //������ɫ��ť        
			   blueButton.setForeground(Color.WHITE);       
			   blueButton.setBackground(Color.blue);       
			   redButton.setText("red");  //���ú�ɫ��ť     
			   redButton.setForeground(Color.WHITE);       
			   redButton.setBackground(Color.red);  
			   
			   northPanel.add(blueButton);  //��Ӱ�ť     
			   northPanel.add(redButton);           
			   add(northPanel,BorderLayout.NORTH);   //������           
			   add(drawball); 
			   
			   blueButton.addActionListener(new ActionListener(){ 
				   public void actionPerformed(ActionEvent evt) {
					   drawball.setColor(Color.BLUE); 
			           drawball.repaint();  //���»���ɫԲ               
			       }       
			   });     
			   
			   redButton.addActionListener(new ActionListener(){ 
			
				   public void actionPerformed(ActionEvent evt) { 
					   drawball.setColor(Color.RED); 
			           drawball.repaint();  //���»���ɫԲ            
			 	   } 
			   });
		 } 

}

