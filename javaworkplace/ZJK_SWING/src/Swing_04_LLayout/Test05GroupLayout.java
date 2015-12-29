package Swing_04_LLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.AbstractListModel;

public class Test05GroupLayout extends JFrame {

	private JPanel contentPane;
	private JTextField txtuesr;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test05GroupLayout frame = new Test05GroupLayout();
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
	public Test05GroupLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("open");
		
		txtuesr = new JTextField();
		txtuesr.setText("/uesr");
		txtuesr.setColumns(10);
		
		JButton btnOpen = new JButton("open");
		
		JSeparator separator = new JSeparator();
		
		JTree tree = new JTree();
		
		JScrollPane scrollPane = new JScrollPane();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JButton btnOk = new JButton("ok");
		
		JButton btnCancel = new JButton("cancel");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(txtuesr, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOpen))
				.addComponent(separator, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tree, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(280)
					.addComponent(btnCancel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnOk))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtuesr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOpen))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(tree, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnOk)
						.addComponent(btnCancel))
					.addContainerGap())
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		
		JCheckBox chckbxA = new JCheckBox("a");
		
		JCheckBox chckbxB = new JCheckBox("b");
		
		JRadioButton radioButton = new JRadioButton("1");
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		
		JCheckBox chckbxC = new JCheckBox("c");
		
		JProgressBar progressBar = new JProgressBar();
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"C#", "JAVA", "C++"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(list, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(21)
									.addComponent(radioButton)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(radioButton_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(radioButton_2))
								.addComponent(chckbxA)
								.addComponent(chckbxB)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(3)
									.addComponent(chckbxC)))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxA)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxB)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(radioButton)
						.addComponent(radioButton_1)
						.addComponent(radioButton_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxC)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		scrollPane.setViewportView(textField);
		textField.setColumns(10);
		contentPane.setLayout(gl_contentPane);
	}
}
