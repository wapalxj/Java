

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;


public class ShapesPanel extends JComponent {
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		//��������ĳ�ʼֵ
		double lineSX = 40;double lineSY = 45;double lineEX = 310;
		double lineEY = 45;double circleCX = 80;double circleCY = 100;
		double radius = 30;	 double rectangleX = 200;
		double rectangleY = 100;double width = 50;double height = 100;
		
		Line2D line = new Line2D.Double(lineSX,lineSY,lineEX,lineEY);
		g2.draw(line);  //��ֱ��
		
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(circleCX, 
		circleCY,circleCX+radius,circleCY+radius);
		g2.setPaint(Color.GREEN);
	    g2.fill(circle);
		g2.draw(circle);   //��Բ
		
		Rectangle2D rect = new 
		Rectangle2D.Double(rectangleX,rectangleY,width,height);
	    g2.setPaint(Color.ORANGE);
	    g2.fill(rect);
		g2.draw(rect);  //������
		
		Font f=new Font("����",Font.BOLD,30);//������
		g2.setPaint(Color.black);
		g2.setFont(f);
		g2.drawString("20121120138�¹�", 100, 300);
		
	}
}
