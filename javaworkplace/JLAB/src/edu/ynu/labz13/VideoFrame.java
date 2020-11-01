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
	  setTitle("20121120138�����¹�"); 
	        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);   
	        JLabel listLabel = new JLabel("Movie testList ", SwingConstants.LEFT);
	        JLabel priceLabel = new JLabel("Yunnan Uni Videos ", SwingConstants.LEFT); 
	        JPanel northPanel = new JPanel();
	        JPanel centerPanel = new JPanel();          
	        listBox = new JComboBox(); 
	        priceField = new JTextField(10); 
	        priceField.setText("Movie Price $0.0");          
	        listBox.setEditable(true); //������Ͽ� 
	        listBox.addItem("none"); 
	        listBox.addItem("�޼��"); 
	        listBox.addItem("����è��");
	        listBox.addItem("�ٶ��뼤��"); 
	        listBox.addItem("����������2");
	        listBox.addItem("����ЧӦ");
	        listBox.addItem("���ŷ���");
	        listBox.addItem("ս��"); 
	        listBox.addItem("��������"); 
	        listBox.addItem("�ط�20��");
	        listBox.addItem("��Ĭ�ĸ���");
	        northPanel.add(listLabel); //������        
	        northPanel.add(listBox); 
	        centerPanel.add(priceLabel);
	        centerPanel.add(priceField);  
	        add(northPanel,BorderLayout.NORTH);  //������ 
	        add(centerPanel,BorderLayout.CENTER);   
	        
	        listBox.addActionListener(new ActionListener(){   //�¼�����      
	        public void actionPerformed(ActionEvent event){ 
		          String str = (String)listBox.getSelectedItem(); 
		          if(str.equals("none")) 
		           priceField.setText("Movie Price $0.0"); 
		          
		          else if(str.equals("�ط�20��") ||str.equals("����ЧӦ")|| str.equals("��Ĭ�ĸ���")) 
		           priceField.setText("Movie Price $2.5"); 
		          else 
		           priceField.setText("Movie Price $2.0"); 
		          } 
		         });
	        
	   } 

	   
}
