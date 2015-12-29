package Swing_03_BasicComponents;
/*
 * 单选与复选控件 JRadioButton 与 JCheckBox 
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class TestRadioBoxAndCheckBox extends JFrame {

	private JPanel contentPane;
	private JRadioButton r1;
	private JRadioButton r2;
	private JRadioButton r3;
	private JButton btnGet;
	private JCheckBox t2_1;
	private JCheckBox t2_2;
	private JCheckBox t2_3;
	private JLabel t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestRadioBoxAndCheckBox frame = new TestRadioBoxAndCheckBox();
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
	public TestRadioBoxAndCheckBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ButtonGroup group =new ButtonGroup();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u9009\u62E9\u98981", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u9009\u62E9\u98982", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		t2_1 = new JCheckBox("JAVA");
		
		t2_2 = new JCheckBox("Swift");
		
		t2_3 = new JCheckBox("C#");
		
		JButton btnNewButton = new JButton("get");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StringBuilder builder =new StringBuilder("You selected");
				if (t2_1.isSelected()) {
					builder.append("+ java");
				}
				if (t2_2.isSelected()) {
					builder.append("+ swift");
				}
				if (t2_3.isSelected()) {
					builder.append("+ c#");
				}
				t2.setText(builder.toString());
			}
		});
		
		t2 = new JLabel(" ");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(t2_1)
						.addComponent(t2_2)
						.addComponent(t2_3)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(t2, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(t2_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(t2_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(t2_3)
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(26)
					.addComponent(t2)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		r1 = new JRadioButton("option1");
		r1.setSelected(true);
		group.add(r1);
		
		r2 = new JRadioButton("option2");
		group.add(r2);
		
		r3 = new JRadioButton("option3");
		group.add(r3);
		
		btnGet = new JButton("get");
		btnGet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (r1.isSelected()) {
					btnGet.setText("1");
				}else if (r2.isSelected()) {
					btnGet.setText("2");
				}else if (r3.isSelected()) {
					btnGet.setText("3");
				}
				
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(r1)
						.addComponent(r2)
						.addComponent(r3)
						.addComponent(btnGet, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(208, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(r1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(r2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(r3)
					.addGap(18)
					.addComponent(btnGet)
					.addContainerGap(78, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
