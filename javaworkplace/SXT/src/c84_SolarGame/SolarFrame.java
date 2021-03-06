package c84_SolarGame;

import java.awt.Graphics;
import java.awt.Image;

/**
 * ̫��ϵ��������
 */
public class SolarFrame extends MyFrame{
	Image bg =GameUtil.getImage("images_Solar/bg.jpg");
	Star sun=new Star("images_Solar/tou.png", Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	Planet earth =new Planet(sun, "images_Solar/earth.png", 150,100,0.1);
	Planet mars=new Planet(earth, "images_Solar/mars.png", 50,30,0.3);
	
	public void paint(Graphics g) {
		g.drawImage(bg,0,0,null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
	}
	
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}
}
