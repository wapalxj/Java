package Swing_09_JFileChooser;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.FlowLayout;

public class TestOpen extends JFrame {

	private JPanel contentPane;
	private JFileChooser chooser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestOpen frame = new TestOpen();
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
	public TestOpen() {
		chooser=new JFileChooser();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		/*
		 * Openfile
		 */
		JButton btnOpen = new JButton("Open file");
		btnOpen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//设置文件过滤
				FileNameExtensionFilter filter=new FileNameExtensionFilter("Allowed File","txt","jar");
				chooser.setFileFilter(filter);
				
				int value =chooser.showOpenDialog(TestOpen.this);
				if (value==JFileChooser.APPROVE_OPTION) {//成功
					File file= chooser.getSelectedFile();
					System.out.println(file.getAbsolutePath());
				}
			}
		});
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		/*
		 * Opendir
		 */
		JButton btnOpenDir = new JButton("open dir");
		btnOpenDir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				chooser.setMultiSelectionEnabled(true);//可以多选
				int value =chooser.showOpenDialog(TestOpen.this);
				if (value==JFileChooser.APPROVE_OPTION) {//成功
//					File file= chooser.getSelectedFile();
//					System.out.println(file.getAbsolutePath());
					
					/*
					 * 多选输出
					 */
					File files[]=chooser.getSelectedFiles();
					for (File file : files) {
						System.out.println(file.getAbsolutePath());
					}
				}
			}
		});
		contentPane.add(btnOpenDir);
		contentPane.add(btnOpen);
	}

}
