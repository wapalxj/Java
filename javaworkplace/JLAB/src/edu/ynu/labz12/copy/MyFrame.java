package edu.ynu.labz12.copy;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;


public class MyFrame extends JFrame {

	private MyPanel contentPane;
	int mx,my;//鼠标的位置
	int jfx,jfy;//鼠标点击时窗体的位置
	private JTextArea inputtArea;
	private JTextArea outputArea;

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyCode()==0) {
					System.exit(0);
				}
			}
		});
		setUndecorated(true);
		setBackground(new Color(0,0,0,0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 445);
		contentPane = new MyPanel();
		/*
		 * 窗体可被鼠标拖动
		 */
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			//鼠标拖拽事件
			public void mouseDragged(MouseEvent e) {
				setLocation(jfx+(e.getXOnScreen()-mx),jfy+(e.getYOnScreen()-my));
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			//鼠标点击事件
			public void mousePressed(MouseEvent e) {
				mx=e.getXOnScreen();
				my=e.getYOnScreen();
				jfx=getX();
				jfy=getY();
			}
		});
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 30, 396, 405);
		contentPane.add(panel);
		JButton btnMax = new JButton("降序排列");
		btnMax.setUI(new MyButtonUI());//使用MyButtonUI自定义MyButton
		btnMax.addMouseListener(new MouseAdapter() {
			@Override
			//降序
			public void mouseClicked(MouseEvent e) {
				String descendNumbers = Descendsort(); 
			    outputArea.setText(descendNumbers);
			}
		});
		
		JButton btnMin = new JButton("升序排列");
		btnMin.setUI(new MyButtonUI());//使用MyButtonUI自定义MyButton
		btnMin.addMouseListener(new MouseAdapter() {
			@Override
			//升序
			public void mouseClicked(MouseEvent e) {
					String ascendNumbers = Ascendsort(); 
				    outputArea.setText(ascendNumbers);
			}
		});
		
		JButton btnExit = new JButton("退出");
		btnExit.setUI(new MyButtonUI());
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		inputtArea = new JTextArea();
		
		outputArea = new JTextArea();
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u4E00\u5217\u6570\u5B57\uFF08\u4E0D\u8981\u4F7F\u7528\u4E2D\u6587\u6807\u70B9\uFF09");
		
		JLabel label_1 = new JLabel("\u6392\u5E8F\u7ED3\u679C");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(155)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnMax)
								.addComponent(btnMin)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(inputtArea, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(outputArea, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(label))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_1)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(169, Short.MAX_VALUE)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(160))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(13)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(inputtArea, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(btnMin)
					.addGap(35)
					.addComponent(btnMax)
					.addGap(17)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(outputArea, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnExit)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
	}
	
	// 数据升序排序
	public String Ascendsort() {
		Sort sort = new Sort();
		String str = inputtArea.getText();
		Pattern pa = Pattern.compile("[.,，。\\/\"\\?!:;-_+=*^&%$#@!{}|?><()']");// 增加对应的标点
		Matcher ma = pa.matcher(str);
		String first = ma.replaceAll(" "); // 把英文标点符号替换成空，即去掉英文标点符号
		first = first.replaceAll(" +", " "); // 去掉输入时多余的空格
		String[] newstr = first.split(" ");
		int m = newstr.length;
		int[] numbers = new int[m + 1];
		int[] ascendSort;
		String ascendNumbers = "";
		for (int i = 0; i < m; i++) {
			numbers[i] = Integer.parseInt(newstr[i]);
			}
		ascendSort = sort.AscendSort(numbers);
		for (int j = 1; j < (ascendSort.length - 1); j++){
			ascendNumbers = ascendNumbers + ascendSort[j] + ", ";
		}
		return ascendNumbers + ascendSort[ascendSort.length - 1];
		
	}
	// 数据升序排序
		public String Descendsort() {
			Sort sort = new Sort();
			String str = inputtArea.getText();
			Pattern pa = Pattern.compile("[.,，。\\/\"\\?!:;-_+=*^&%$#@!{}|?><()']");// 增加对应的标点
			Matcher ma = pa.matcher(str);
			String first = ma.replaceAll(" "); // 把英文标点符号替换成空，即去掉英文标点符号
			first = first.replaceAll(" +", " "); // 去掉输入时多余的空格
			String[] newstr = first.split(" ");
			int m = newstr.length;
			int[] numbers = new int[m + 1];
			int[] decendSort;
			String decendNumbers = "";
			for (int i = 0; i < m; i++) {
				numbers[i] = Integer.parseInt(newstr[i]);
				}
			decendSort = sort.DescendSort(numbers);
			for (int j = 0; j < (decendSort.length - 2); j++){
				decendNumbers = decendNumbers + decendSort[j] + ", ";
			}
			return decendNumbers + decendSort[decendSort.length-2];
			
		}
	
}
