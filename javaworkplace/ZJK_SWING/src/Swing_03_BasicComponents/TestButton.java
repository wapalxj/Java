package Swing_03_BasicComponents;
/*
 * 1.Button
 * 2.±¾¿ò¿Ø¼þ JTextField Óë JTextArea
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;

public class TestButton extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea testarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestButton frame = new TestButton();
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
	public TestButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u8BBE\u5B9A");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				testarea.setText(textField.getText());
//				System.out.println(textField.getText());
				System.out.println(testarea.getText());
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		testarea = new JTextArea();
		scrollPane.setViewportView(testarea);
	}

}
