package Swing_03_BasicComponents;
/*
 * ап╠М©ь╪Ч JList 
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestList extends JFrame {

	private JPanel contentPane;
	private JList<String> list;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestList frame = new TestList();
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
	public TestList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		list = new JList<String>();
		list.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"java", "swift", "c#", "python"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list, BorderLayout.NORTH);
		
		label = new JLabel(" ");
		contentPane.add(label, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("get");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] v=list.getSelectedValues();
				StringBuilder builder=new StringBuilder("You selected ");
				for (int i = 0; i < v.length; i++) {
					builder.append("+").append(v[i]);
				}
				label.setText(builder.toString());
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
