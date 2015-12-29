package edu.ynu.labz13;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 

public class VideoFrame extends JFrame { 
	 private JComboBox listBox; 
	 private JTextField priceField; 
	 private static final int DEFAULT_WIDTH = 400;
	 private static final int DEFAULT_HEIGHT = 150;
	 
	 public VideoFrame()  { 
	  setTitle("20121120138——穆桂海"); 
	        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);   
	        JLabel listLabel = new JLabel("Movie List ", SwingConstants.LEFT);     
	        JLabel priceLabel = new JLabel("Yunnan Uni Videos ", SwingConstants.LEFT); 
	        JPanel northPanel = new JPanel();
	        JPanel centerPanel = new JPanel();          
	        listBox = new JComboBox(); 
	        priceField = new JTextField(10); 
	        priceField.setText("Movie Price $0.0");          
	        listBox.setEditable(true); //设置组合框 
	        listBox.addItem("none"); 
	        listBox.addItem("无间道"); 
	        listBox.addItem("虎妈猫爸");
	        listBox.addItem("速度与激情"); 
	        listBox.addItem("复仇者联盟2");
	        listBox.addItem("蝴蝶效应");
	        listBox.addItem("澳门风云");
	        listBox.addItem("战狼"); 
	        listBox.addItem("万物生长"); 
	        listBox.addItem("重返20岁");
	        listBox.addItem("沉默的羔羊");
	        northPanel.add(listLabel); //添加组件        
	        northPanel.add(listBox); 
	        centerPanel.add(priceLabel);
	        centerPanel.add(priceField);  
	        add(northPanel,BorderLayout.NORTH);  //添加面板 
	        add(centerPanel,BorderLayout.CENTER);   
	        
	        listBox.addActionListener(new ActionListener(){   //事件处理      
	        public void actionPerformed(ActionEvent event){ 
		          String str = (String)listBox.getSelectedItem(); 
		          if(str.equals("none")) 
		           priceField.setText("Movie Price $0.0"); 
		          
		          else if(str.equals("重返20岁") ||str.equals("蝴蝶效应")|| str.equals("沉默的羔羊")) 
		           priceField.setText("Movie Price $2.5"); 
		          else 
		           priceField.setText("Movie Price $2.0"); 
		          } 
		         });
	        
	   } 

	   
}
