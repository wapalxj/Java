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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame {

	private MyPanel contentPane;
	int mx,my;//����λ��
	int jfx,jfy;//�����ʱ�����λ��
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
		setBounds(100, 100, 450, 300);
		contentPane = new MyPanel();
		/*
		 * ����ɱ�����϶�
		 */
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			//�����ק�¼�
			public void mouseDragged(MouseEvent e) {
				setLocation(jfx+(e.getXOnScreen()-mx),jfy+(e.getYOnScreen()-my));
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			//������¼�
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
		panel.setBounds(0, 30, 450, 260);
		panel.setOpaque(false);
		contentPane.add(panel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setUI(new MyButtonUI());//ʹ��MyButtonUI�Զ���MyButton
		JButton btnMax = new JButton("MAX");
		btnMax.setUI(new MyButtonUI());//ʹ��MyButtonUI�Զ���MyButton
		btnMax.addMouseListener(new MouseAdapter() {
			@Override
			//��󻯴���
			public void mouseClicked(MouseEvent e) {
				if (getExtendedState()==JFrame.MAXIMIZED_BOTH) {
					setExtendedState(JFrame.NORMAL);
				}else {
					setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
			}
		});
		
		JButton btnMin = new JButton("MIN");
		btnMin.setUI(new MyButtonUI());//ʹ��MyButtonUI�Զ���MyButton
		btnMin.addMouseListener(new MouseAdapter() {
			@Override
			//��С������
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
					.addComponent(btnExit)
					.addGap(19))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(227, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnExit)
						.addComponent(btnMax)
						.addComponent(btnMin))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(155, 10, 105, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("about");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							About frame = new About();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
	
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("help");
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
	}
}
