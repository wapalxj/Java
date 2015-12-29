package Swing_07_1_Main_Thread;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewFrame extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewFrame frame = new NewFrame();
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
	public NewFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		/*
		 * 进度条
		 */
		progressBar = new JProgressBar();
		contentPane.add(progressBar, BorderLayout.NORTH);
		/*
		 * Button
		 */
		JButton btnRun = new JButton("run");
		btnRun.addMouseListener(new MouseAdapter() {
			@Override
			//每点一次进度条进%10
			public void mouseClicked(MouseEvent e) {
				progressBar.setValue(progressBar.getValue()+10);
			}
		});
		contentPane.add(btnRun, BorderLayout.CENTER);
	}

}
