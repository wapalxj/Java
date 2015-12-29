package Swing_05_2_PaintAPI;
/*常用绘图API
 * draw:画线框图形
 * fill:填充
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel 
{
	BufferedImage img=null;
	
	public MyPanel() {
		super();
		try {
			img=ImageIO.read(getClass().getResourceAsStream("fl2.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 *绘制组件本身 
	 */
	@Override
	protected void paintComponent(Graphics g) {
//		//画方形
//		g.setColor(new Color(255,100,0));
//		g.drawRect(50, 50, 100, 100);//画线框
//		g.fillRect(50, 50, 100, 100);//填充
//		g.fillRoundRect(50, 50, 100, 100,50,50);//圆角
//		//画圆
//		g.setColor(new Color(0,255,255));
//		g.drawOval(200, 50, 100, 100);
//		g.fillOval(200, 50, 100, 100);
//		//画字符串
//		g.setColor(new Color(255,0,0));
//		g.setFont(new Font("Arial",Font.BOLD,20));
//		g.drawString("TestAPI", 200, 200);
		//画弧线
//		g.drawArc(0, 0, 200, 200, 0,90);
//		g.fillArc(0, 0, 200, 200, 0,90);
		//画线条
//		g.drawLine(0, 0, 400, 400);
		//画图片
		if (img!=null) {
//			g.drawImage(img, 20, 20, null);
			g.drawImage(img, 0, 0, 100, 100, null);
		}
		//画多边形
//		g.drawPolygon(new int[]{1,23,56,89,15},new int[]{10,3,155,54,43},5);
//		g.fillPolygon(new int[]{1,23,56,89,15},new int[]{10,3,155,54,43},5);
		
		/*
		 * 使用 Java2D 改善 API 的绘制效果
		 */
//		Graphics2D g2d =(Graphics2D) g;
		//消除锯齿
//		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//		g2d.setStroke(new BasicStroke(5,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_ROUND));//粗细，拐角圆形
//		g2d.drawPolygon(new int[]{1,23,56,89,15},new int[]{10,3,155,54,43},5);
//		g2d.drawLine(100, 50, 460, 470);
//		g2d.setClip(0,0,100,100);//超出（100,100）区域不在绘制
	}

	@Override
	protected void paintChildren(Graphics g) {
		// TODO Auto-generated method stub
		super.paintChildren(g);
	}

	@Override
	protected void paintBorder(Graphics g) {
		// TODO Auto-generated method stub
		super.paintBorder(g);
	}
	

}
