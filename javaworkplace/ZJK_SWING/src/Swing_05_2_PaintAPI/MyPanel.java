package Swing_05_2_PaintAPI;
/*���û�ͼAPI
 * draw:���߿�ͼ��
 * fill:���
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
	 *����������� 
	 */
	@Override
	protected void paintComponent(Graphics g) {
//		//������
//		g.setColor(new Color(255,100,0));
//		g.drawRect(50, 50, 100, 100);//���߿�
//		g.fillRect(50, 50, 100, 100);//���
//		g.fillRoundRect(50, 50, 100, 100,50,50);//Բ��
//		//��Բ
//		g.setColor(new Color(0,255,255));
//		g.drawOval(200, 50, 100, 100);
//		g.fillOval(200, 50, 100, 100);
//		//���ַ���
//		g.setColor(new Color(255,0,0));
//		g.setFont(new Font("Arial",Font.BOLD,20));
//		g.drawString("TestAPI", 200, 200);
		//������
//		g.drawArc(0, 0, 200, 200, 0,90);
//		g.fillArc(0, 0, 200, 200, 0,90);
		//������
//		g.drawLine(0, 0, 400, 400);
		//��ͼƬ
		if (img!=null) {
//			g.drawImage(img, 20, 20, null);
			g.drawImage(img, 0, 0, 100, 100, null);
		}
		//�������
//		g.drawPolygon(new int[]{1,23,56,89,15},new int[]{10,3,155,54,43},5);
//		g.fillPolygon(new int[]{1,23,56,89,15},new int[]{10,3,155,54,43},5);
		
		/*
		 * ʹ�� Java2D ���� API �Ļ���Ч��
		 */
//		Graphics2D g2d =(Graphics2D) g;
		//�������
//		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//		g2d.setStroke(new BasicStroke(5,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_ROUND));//��ϸ���ս�Բ��
//		g2d.drawPolygon(new int[]{1,23,56,89,15},new int[]{10,3,155,54,43},5);
//		g2d.drawLine(100, 50, 460, 470);
//		g2d.setClip(0,0,100,100);//������100,100�������ڻ���
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
