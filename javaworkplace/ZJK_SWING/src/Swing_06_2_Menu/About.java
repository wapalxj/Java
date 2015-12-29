package Swing_06_2_Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public About() {
		setBackground(Color.BLACK);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(244, 267, 93, 23);
		contentPane.add(btnExit);
		
		JTextPane txtpni = new JTextPane();
		txtpni.setFocusable(false);
		txtpni.setText("\u65B9\u5411\u952E\uFF1A\r\n\u4E0A\uFF1Ai   \u4E0B:   k    \u5DE6:j   \u53F3:l\r\n\u6682\u505C\uFF1A");
		txtpni.setBounds(10, 10, 327, 234);
		contentPane.add(txtpni);
	}
}
