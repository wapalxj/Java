package edu.ynu.labz12;
/*
 * ʹ�û�ͼAPI�Զ������
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d=(Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//�����ɫ��Ļ
//		g2d.setColor(new Color(132,87,15,250));
		g2d.setColor(new Color(239,154,72,250));
		g2d.fillRoundRect(3, 3, getWidth()-7, getHeight()-7, 20, 20);
		//��ɫɫ��
		g2d.setColor(Color.white);
		g2d.setClip(0,0,getWidth(),30);
		g2d.fillRoundRect(1, 3, getWidth()-2, getHeight()-1, 20, 20);
		g2d.setClip(null);
		//�߿�
		g2d.setColor(Color.darkGray);
		g2d.setStroke(new BasicStroke(6));//ָ���ʴ�
		g2d.drawRoundRect(3, 3, getWidth()-7, getHeight()-7, 20, 20);
	
		g2d.setFont(new Font("����",Font.BOLD,15));
		g2d.setColor(Color.BLACK);
		g2d.drawString("20121120138-�¹�", 15, 24);
	}
}
