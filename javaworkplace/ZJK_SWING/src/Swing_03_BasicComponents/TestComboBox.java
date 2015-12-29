package Swing_03_BasicComponents;
/*
 * ÏÂÀ­²Ëµ¥ JComboBox 
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javafx.scene.control.ComboBox;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class TestComboBox extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel label;
	private JButton btnGet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestComboBox frame = new TestComboBox();
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
	public TestComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label.setText(comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Java", "Swift", "C#", "Python"}));
		contentPane.add(comboBox, BorderLayout.NORTH);
		
		label = new JLabel(" ");
		contentPane.add(label, BorderLayout.CENTER);
		
		btnGet = new JButton("get");
		btnGet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setText(comboBox.getSelectedItem().toString());
			}
		});
		contentPane.add(btnGet, BorderLayout.SOUTH);
	}

}
