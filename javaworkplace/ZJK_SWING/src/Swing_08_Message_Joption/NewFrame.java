package Swing_08_Message_Joption;
/*
 * ������Ϣ��ʾ 
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
		 * showConfirmDialog:ȷ����ʾ��
		 */
		JButton btnshowconfirmdialog = new JButton("(\u663E\u793A\u786E\u8BA4\u6846)showConfirmDialog");
		btnshowconfirmdialog.addMouseListener(new MouseAdapter() {
			@Override
//������			
			public void mouseClicked(MouseEvent e) {
//				int value =JOptionPane.showConfirmDialog(NewFrame.this, "ȷ�ϣ�");
//				if (value==JOptionPane.YES_OPTION) {
//					System.exit(0);
//				}else if(value==JOptionPane.CANCEL_OPTION){
//					System.out.println("ȡ����");
//				}else if(value==JOptionPane.NO_OPTION){
//					System.out.println("��");
//				}else if(value==JOptionPane.CLOSED_OPTION){
//					System.out.println("����رգ�");
//				}
//��һ������				
				int value =JOptionPane.showConfirmDialog(NewFrame.this, "ȷ���˳���", "��ȷ��", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
				if (value==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		
		});
		btnshowconfirmdialog.setBounds(10, 10, 301, 23);
		contentPane.add(btnshowconfirmdialog);

		/*
		 * showMessageDialog����Ϣ��ʾ��
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
		 * showInputDialog����ʾ�����
		 */
		JButton btnshowinputdialog = new JButton("(\u663E\u793A\u8F93\u5165\u6846)showInputDialog");
		btnshowinputdialog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				String in=JOptionPane.showInputDialog("Input", "abc");
//				String in =JOptionPane.showInputDialog(NewFrame.this, "����������", "����", JOptionPane.WARNING_MESSAGE);
				String in =(String) JOptionPane.showInputDialog(NewFrame.this, "����������", "����", JOptionPane.WARNING_MESSAGE, null, new String[]{"aaa","bbb","ccc"}, "");
				JOptionPane.showMessageDialog(NewFrame.this, in);
			}
		});
		btnshowinputdialog.setBounds(10, 76, 301, 23);
		contentPane.add(btnshowinputdialog);
		
		/*
		 * showOptionDialog����ʾ����ѡ���
		 */
		JButton btnshowoptiondialog = new JButton("(\u663E\u793A\u591A\u9879\u9009\u62E9\u6846)showOptionDialog");
		btnshowoptiondialog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String options[]={"�ƻ�A","�ƻ�B","�ƻ�C","�ƻ�D","�ƻ�E"};
				int v=JOptionPane.showOptionDialog(NewFrame.this, "ѡ��һ���ʺϼƻ�", "ѡ��ƻ�", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "�ƻ�A");
				if (v!=JOptionPane.CLOSED_OPTION) {
					switch (v) {
					case 0:System.out.println("�ƻ�A");break;
					case 1:System.out.println("�ƻ�B");break;
					case 2:System.out.println("�ƻ�C");break;
					case 3:System.out.println("�ƻ�D");break;
					case 4:System.out.println("�ƻ�E");break;
					
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
