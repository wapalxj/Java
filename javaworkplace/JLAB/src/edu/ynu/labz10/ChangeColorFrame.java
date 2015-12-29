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
			   setTitle("颜色变换"); 
			   setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);       
			   drawball = new DrawBall(); 
			   drawball.setColor(Color.WHITE);  //设置圆的初始颜色       
			   
			   JPanel northPanel = new JPanel(); 
			   blueButton = new JButton();  //实例化按钮   
			   redButton = new JButton();
			   blueButton.setText("blue");  //设置蓝色按钮        
			   blueButton.setForeground(Color.WHITE);       
			   blueButton.setBackground(Color.blue);       
			   redButton.setText("red");  //设置红色按钮     
			   redButton.setForeground(Color.WHITE);       
			   redButton.setBackground(Color.red);  
			   
			   northPanel.add(blueButton);  //添加按钮     
			   northPanel.add(redButton);           
			   add(northPanel,BorderLayout.NORTH);   //添加面板           
			   add(drawball); 
			   
			   blueButton.addActionListener(new ActionListener(){ 
				   public void actionPerformed(ActionEvent evt) {
					   drawball.setColor(Color.BLUE); 
			           drawball.repaint();  //重新画蓝色圆               
			       }       
			   });     
			   
			   redButton.addActionListener(new ActionListener(){ 
			
				   public void actionPerformed(ActionEvent evt) { 
					   drawball.setColor(Color.RED); 
			           drawball.repaint();  //重新画红色圆            
			 	   } 
			   });
		 } 

}

