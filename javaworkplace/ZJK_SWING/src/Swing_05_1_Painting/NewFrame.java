package Swing_05_1_Painting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class NewFrame extends JFrame {

	private MyPanel contentPane;

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
		contentPane = new MyPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.BLUE, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("New label");
		contentPane.add(label, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, BorderLayout.CENTER);
	}

}
