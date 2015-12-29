package Swing_03_BasicComponents;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class TestLab extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestLab frame = new TestLab();
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
	public TestLab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblThisIsA = new JLabel("this is a label");
		lblThisIsA.setVerticalAlignment(SwingConstants.TOP);
//		lblThisIsA.setText("this is a label");
		lblThisIsA.setToolTipText("good");
		lblThisIsA.setIcon(new ImageIcon(TestLab.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
		lblThisIsA.setForeground(Color.DARK_GRAY);
		lblThisIsA.setFont(new Font("ËÎÌו", Font.PLAIN, 12));
		contentPane.add(lblThisIsA, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
