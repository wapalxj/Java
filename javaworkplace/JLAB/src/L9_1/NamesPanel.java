package L9_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JOptionPane;


public class NamesPanel extends JComponent {

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;	
		String str ="穆桂海";
		double messageX = 150;  double messageY = 50;
		Font f1 = new Font("Serif",Font.BOLD,4); //设置字体
		g2.setPaint(Color.RED);  //设置字体颜色
		
		for(float i=4; i <= 24; i+=2)  //循环输出名字
		{
			Font f = f1.deriveFont(i);  //设置字体大小
			g2.setFont(f);					    
		    g2.drawString(str,(int)messageX,(int)messageY);
		    
			FontRenderContext context = g2.getFontRenderContext();
		    Rectangle2D bounds = f.getStringBounds(str, context);
		    messageY += bounds.getHeight()+2;  //更改输出字符串的纵坐标值
		    } 
		}
}
