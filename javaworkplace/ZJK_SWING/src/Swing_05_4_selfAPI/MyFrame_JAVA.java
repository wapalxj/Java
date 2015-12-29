package Swing_05_4_selfAPI;

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
import javax.swing.LayoutStyle.ComponentPlacement;

public class MyFrame_JAVA extends JFrame {

	private MyPanel contentPane;
	int mx,my;//鼠标的位置
	int jfx,jfy;//鼠标点击时窗体的位置
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame_JAVA frame = new MyFrame_JAVA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame_JAVA() {
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
		setBounds(100, 100, 450, 300);
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
		panel.setBounds(0, 30, 450, 260);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Exit");
		
		JButton btnMax = new JButton("MAX");
		btnMax.setUI(new MyButtonUI());
		btnMax.addMouseListener(new MouseAdapter() {
			@Override
			//最大化窗口
			public void mouseClicked(MouseEvent e) {
				if (getExtendedState()==JFrame.MAXIMIZED_BOTH) {
					setExtendedState(JFrame.NORMAL);
				}else {
					setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
			}
		});
		
		JButton btnMin = new JButton("MIN");
		btnMin.addMouseListener(new MouseAdapter() {
			@Override
			//最小化窗口
			public void mouseClicked(MouseEvent e) {
				if (getExtendedState()==JFrame.ICONIFIED) {
					setExtendedState(JFrame.NORMAL);
				}else {
					setExtendedState(JFrame.ICONIFIED);
				}
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(218, Short.MAX_VALUE)
					.addComponent(btnMin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMax)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(19))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(227, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnMax)
						.addComponent(btnMin))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
	}
}
