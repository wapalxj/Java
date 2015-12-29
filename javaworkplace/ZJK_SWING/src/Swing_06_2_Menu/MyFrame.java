package Swing_06_2_Menu;
/*���𣺴�����ʽ��ͬ��
 * JMenuBar�е�Menu��ͨ���˵��������ĵ��
 * JPopupMenu�е�Menu��ͨ��������ֵ���ʽ�˵�
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	JPopupMenu popupMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setIcon(new ImageIcon(MyFrame.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmClose = new JMenuItem("close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmClose);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmUbdo = new JMenuItem("Undo");
		mnEdit.add(mntmUbdo);
		
		JMenu mnStye = new JMenu("Style");
		mnEdit.add(mnStye);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("red");
		mnStye.add(mntmNewMenuItem);
		
		JMenuItem mntmBlue = new JMenuItem("blue");
		mnStye.add(mntmBlue);
		
		mnEdit.addSeparator();//��ӷָ���
		JCheckBoxMenuItem chckbxmntmA = new JCheckBoxMenuItem("a");
		mnEdit.add(chckbxmntmA);
		chckbxmntmA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(chckbxmntmA.getState());
				
			}
		});
		
		JCheckBoxMenuItem chckbxmntmB = new JCheckBoxMenuItem("b");
		mnEdit.add(chckbxmntmB);
		
		JCheckBoxMenuItem chckbxmntmC = new JCheckBoxMenuItem("c");
		mnEdit.add(chckbxmntmC);
		
		mnEdit.addSeparator();//��ӷָ���
		
		JRadioButtonMenuItem rdbtnmntmT = new JRadioButtonMenuItem("T1");
		mnEdit.add(rdbtnmntmT);
		
		JRadioButtonMenuItem rdbtnmntmT_1 = new JRadioButtonMenuItem("T2");
		mnEdit.add(rdbtnmntmT_1);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			//�����setContentPane�ĵط������˵�
			public void mouseClicked(MouseEvent e) {
				popupMenu.show(MyFrame.this, e.getX(), e.getY());
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		/*
		 * ���������Ĳ˵�
		 */
		popupMenu=new JPopupMenu();
		
		JMenuItem itme1=new JMenuItem("A");
		JMenuItem itme2=new JMenuItem("B");
		JMenuItem itme3=new JMenuItem("C");
		JMenuItem itme4=new JMenuItem("D");
		
		popupMenu.add(itme1);
		popupMenu.add(itme2);
		mnEdit.addSeparator();//��ӷָ���
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
//		popupMenu.add(itme3);
//		popupMenu.add(itme4);
		
		JMenu menu =new JMenu("Open");
		menu.add(itme3);
		menu.add(itme4);
		popupMenu.add(menu);
	
	}

}
