package Swing_09_JFileChooser;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class TestSave extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestSave frame = new TestSave();
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
	public TestSave() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnSave = new JButton("Save");
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser chooser=new JFileChooser();
				int value=chooser.showSaveDialog(TestSave.this);
				if (value==JFileChooser.APPROVE_OPTION) {
					/*
					 * 创建文件
					 */
					File newFile =chooser.getSelectedFile();
					if (newFile.exists()==false) {
						try {
							newFile.createNewFile();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					System.out.println(chooser.getSelectedFile().getAbsolutePath());
				}
			}
		});
		contentPane.add(btnSave, BorderLayout.NORTH);
	}

}
