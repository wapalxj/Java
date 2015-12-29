package Swing_05_1_Painting;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	//绘制组件自身所调用的方法
	@Override
	protected void paintComponent(Graphics g) {
		System.out.println("paintComponent(Graphics g");
		super.paintComponent(g);
	}
	//绘制其中子组件所调用的方法
	@Override
	protected void paintChildren(Graphics g) {
		System.out.println("paintChildren(Graphics g)");
		super.paintChildren(g);
	}
	//绘制自身的边缘(边框)所调用的方法
	@Override
	protected void paintBorder(Graphics g) {
		System.out.println("paintBorder(Graphics g)");
		super.paintBorder(g);
	}	
	//组件就有更新时，系统自动调用
	@Override
	public void paint(Graphics g) {
		System.out.println("paint(Graphics g)");
		super.paint(g);
	}
	
}
