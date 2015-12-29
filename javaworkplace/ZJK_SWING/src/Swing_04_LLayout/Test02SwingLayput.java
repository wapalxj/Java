package Swing_04_LLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingWorker;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Test02SwingLayput extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test02SwingLayput frame = new Test02SwingLayput();
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
	public Test02SwingLayput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 414, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SwingWorker<String, Integer>() {
					int oriy =lblNewLabel.getY();
					@Override
					protected String doInBackground() throws Exception {
						while (true) {
							Thread.sleep(00);
							publish((int)(Math.cos(System.currentTimeMillis()/100)*50));
								
						}
					}

					@Override
					protected void process(List<Integer> chunks) {
						for (int y:chunks) {
							lblNewLabel.setLocation(lblNewLabel.getX(),oriy+y);
						}
						super.process(chunks);
					}
					
					
				}.execute();
			}
		});
		btnNewButton.setBounds(10, 57, 93, 23);
		contentPane.add(btnNewButton);
		
	
		lblNewLabel.setLocation(130,57);
		lblNewLabel.setSize(200,50);
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
	}
}
