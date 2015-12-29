package Swing_08_Message_Joption;
/*
 * 界面消息提示 
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewFrame extends JFrame {

	private JPanel contentPane;

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*
		 * showConfirmDialog:确认提示框
		 */
		JButton btnshowconfirmdialog = new JButton("(\u663E\u793A\u786E\u8BA4\u6846)showConfirmDialog");
		btnshowconfirmdialog.addMouseListener(new MouseAdapter() {
			@Override
//简单运用			
			public void mouseClicked(MouseEvent e) {
//				int value =JOptionPane.showConfirmDialog(NewFrame.this, "确认？");
//				if (value==JOptionPane.YES_OPTION) {
//					System.exit(0);
//				}else if(value==JOptionPane.CANCEL_OPTION){
//					System.out.println("取消！");
//				}else if(value==JOptionPane.NO_OPTION){
//					System.out.println("否！");
//				}else if(value==JOptionPane.CLOSED_OPTION){
//					System.out.println("窗体关闭！");
//				}
//进一步运用				
				int value =JOptionPane.showConfirmDialog(NewFrame.this, "确认退出吗？", "请确认", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
				if (value==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		
		});
		btnshowconfirmdialog.setBounds(10, 10, 301, 23);
		contentPane.add(btnshowconfirmdialog);

		/*
		 * showMessageDialog：消息提示框
		 */
		JButton btnshowmeaasgadialog = new JButton("(\u663E\u793A\u6D88\u606F\u6846)showMeaasgaDialog");
		btnshowmeaasgadialog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(NewFrame.this, "NUll Pointer Exception","ERRPR",JOptionPane.WARNING_MESSAGE);
				
			}
		});
		btnshowmeaasgadialog.setBounds(10, 43, 301, 23);
		contentPane.add(btnshowmeaasgadialog);
		
		/*
		 * showInputDialog：显示输入框
		 */
		JButton btnshowinputdialog = new JButton("(\u663E\u793A\u8F93\u5165\u6846)showInputDialog");
		btnshowinputdialog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				String in=JOptionPane.showInputDialog("Input", "abc");
//				String in =JOptionPane.showInputDialog(NewFrame.this, "请输入密码", "输入", JOptionPane.WARNING_MESSAGE);
				String in =(String) JOptionPane.showInputDialog(NewFrame.this, "请输入密码", "输入", JOptionPane.WARNING_MESSAGE, null, new String[]{"aaa","bbb","ccc"}, "");
				JOptionPane.showMessageDialog(NewFrame.this, in);
			}
		});
		btnshowinputdialog.setBounds(10, 76, 301, 23);
		contentPane.add(btnshowinputdialog);
		
		/*
		 * showOptionDialog：显示多项选择框
		 */
		JButton btnshowoptiondialog = new JButton("(\u663E\u793A\u591A\u9879\u9009\u62E9\u6846)showOptionDialog");
		btnshowoptiondialog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String options[]={"计划A","计划B","计划C","计划D","计划E"};
				int v=JOptionPane.showOptionDialog(NewFrame.this, "选择一个适合计划", "选择计划", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "计划A");
				if (v!=JOptionPane.CLOSED_OPTION) {
					switch (v) {
					case 0:System.out.println("计划A");break;
					case 1:System.out.println("计划B");break;
					case 2:System.out.println("计划C");break;
					case 3:System.out.println("计划D");break;
					case 4:System.out.println("计划E");break;
					
					default:
						break;
					}
				}
			}
		});
		btnshowoptiondialog.setBounds(10, 109, 301, 23);
		contentPane.add(btnshowoptiondialog);
		
		
	}
}
