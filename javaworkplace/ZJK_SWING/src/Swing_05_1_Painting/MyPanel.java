package Swing_05_1_Painting;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	//����������������õķ���
	@Override
	protected void paintComponent(Graphics g) {
		System.out.println("paintComponent(Graphics g");
		super.paintComponent(g);
	}
	//������������������õķ���
	@Override
	protected void paintChildren(Graphics g) {
		System.out.println("paintChildren(Graphics g)");
		super.paintChildren(g);
	}
	//��������ı�Ե(�߿�)�����õķ���
	@Override
	protected void paintBorder(Graphics g) {
		System.out.println("paintBorder(Graphics g)");
		super.paintBorder(g);
	}	
	//������и���ʱ��ϵͳ�Զ�����
	@Override
	public void paint(Graphics g) {
		System.out.println("paint(Graphics g)");
		super.paint(g);
	}
	
}
