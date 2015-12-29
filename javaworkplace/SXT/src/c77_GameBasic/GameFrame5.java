package c77_GameBasic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * ”ÎConstant,MyFrame¡¨”√
 * @param args
 */
public class GameFrame5 extends MyFrame{
	Image img =GameUtil.getImage("images_Solar/tou.png") ;
	
	
	private double x=100,y=100;
	private double degree=3.14/3;//[0,2pi]
	private double speed=10;
	@Override
	public void paint(Graphics g) {
	
		g.drawImage(img, (int)x,(int)y,null);
	
		x=100+100*Math.cos(degree);
		y=200+50*Math.sin(degree);
		
		degree+=0.1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame5 gf=new GameFrame5();
		gf.launchFrame();
		
	}

}
