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
		String str ="�¹�";
		double messageX = 150;  double messageY = 50;
		Font f1 = new Font("Serif",Font.BOLD,4); //��������
		g2.setPaint(Color.RED);  //����������ɫ
		
		for(float i=4; i <= 24; i+=2)  //ѭ���������
		{
			Font f = f1.deriveFont(i);  //���������С
			g2.setFont(f);					    
		    g2.drawString(str,(int)messageX,(int)messageY);
		    
			FontRenderContext context = g2.getFontRenderContext();
		    Rectangle2D bounds = f.getStringBounds(str, context);
		    messageY += bounds.getHeight()+2;  //��������ַ�����������ֵ
		    } 
		}
}
