package edu.ynu.labz10;

import java.awt.*; 
import java.awt.geom.*; 

import javax.swing.*;  

public class DrawBall extends JPanel { 
	 Color color = null; 
	 public void setColor(Color c)  { 
	  this.color = c; 
	 } 
	
	 public void paintComponent(Graphics g)  { 
		  Graphics2D g2 = (Graphics2D)g;
		  super.paintComponent(g);    
		  //设置坐标的初始值 
		  double ballX = 400;
		  double ballY = 300;
		  double radius = 100;    
		  Ellipse2D circle = new Ellipse2D.Double();  
		  circle.setFrameFromCenter(ballX,  
		  ballY,ballX+radius,ballY+radius); 
		  g2.setPaint(color);  //设置圆的颜色 
		  g2.fill(circle); 
		  g2.draw(circle);   //画圆 
		  
		  Font f=new Font("宋体",Font.BOLD,30);//画名字
		  g2.setFont(f);
		  g2.drawString("20121120138穆桂海", 350, 600);
	 }
}

