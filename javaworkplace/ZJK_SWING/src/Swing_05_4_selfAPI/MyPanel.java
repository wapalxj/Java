package Swing_05_4_selfAPI;
/*
 * 使用绘图API自定义组件
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	BufferedImage img=null;
	public MyPanel() {
		super();
		try {
			img=ImageIO.read(getClass().getResourceAsStream("fl2.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d=(Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//中央白色屏幕
		g2d.setColor(new Color(255,255,255,140));
		g2d.fillRoundRect(3, 3, getWidth()-7, getHeight()-7, 20, 20);
		//白色色条
		g2d.setColor(Color.white);
		g2d.setClip(0,0,getWidth(),30);
		g2d.fillRoundRect(1, 3, getWidth()-2, getHeight()-1, 20, 20);
		g2d.setClip(null);
		//边框
		g2d.setColor(Color.darkGray);
		g2d.setStroke(new BasicStroke(6));//指定笔触
		g2d.drawRoundRect(3, 3, getWidth()-7, getHeight()-7, 20, 20);
		
		if (img!=null) {
//			g.drawImage(img, 20, 20, null);
			g.drawImage(img, 5, 31, getWidth()-10, getHeight()-36, null);
			
		}
		
		g2d.setFont(new Font("Arial",Font.BOLD,16));
		g2d.setColor(Color.BLACK);
		g2d.drawString("SWING UI API", 15, 24);
	}
}
