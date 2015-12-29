package Swing_07_2_SwingTimer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;


import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestTimer extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;
	private JButton btnRun;
	int value=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestTimer frame = new TestTimer();
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
	public TestTimer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		progressBar = new JProgressBar();
		contentPane.add(progressBar, BorderLayout.NORTH);
		
		btnRun = new JButton("run");
		btnRun.addMouseListener(new MouseAdapter() {
			@Override
			//�����������ÿ������%10
			public void mouseClicked(MouseEvent e) {
				Timer timer =new Timer(1000,new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						value+=10;
						progressBar.setValue(value);
						if (value==100) {
							value=0;
						}
					}
				});
				timer.setRepeats(true);//�����ظ�ִ��
				timer.start();
			}
		});	
		contentPane.add(btnRun, BorderLayout.CENTER);
	}

}
