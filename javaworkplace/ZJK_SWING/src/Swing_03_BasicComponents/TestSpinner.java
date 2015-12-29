package Swing_03_BasicComponents;
/*
 * µ÷½Ú¿Ø¼þ JSpinner 
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestSpinner extends JFrame {

	private JPanel contentPane;
	private JButton btnGet;
	private JLabel label;
	private JSpinner spinner_1;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestSpinner frame = new TestSpinner();
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
	public TestSpinner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(60, 0, 100, 1));
		contentPane.add(spinner, BorderLayout.NORTH);
		
		label = new JLabel("00");
		contentPane.add(label, BorderLayout.EAST);
		
		btnGet = new JButton("get");
		btnGet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int v=Integer.parseInt(spinner.getValue().toString());
				double v2 =Double.parseDouble(spinner_1.getValue().toString());
				label.setText(v+v2+"");
			}
		});
		contentPane.add(btnGet, BorderLayout.SOUTH);
		
		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(65, 0, 100, 1));
		contentPane.add(spinner_1, BorderLayout.CENTER);
	}

}
