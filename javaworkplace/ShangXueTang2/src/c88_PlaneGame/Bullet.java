package c88_PlaneGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Bullet extends GameObject{
	double degree;
	
//	public Bullet() {
//		degree=Math.random()*Math.PI*2;
//		this.x=Constant.GAME_HEIGHT/2;
//		this.y=Constant.GAME_WIDTH/2;
//	}
//	public void draw(Graphics g) {
//		Color c=g.getColor();
//		g.setColor(Color.red);
//		g.fillOval((int)x, (int)y,width, height);
//		
//		x+=speed*Math.cos(degree);
//		y+=speed*Math.sin(degree);
//		
//	
//		if (y>Constant.GAME_HEIGHT-height||y<30) {
//			degree=-degree;
//		}
//		if (x<0||x>Constant.GAME_WIDTH-width) {
//			degree=Math.PI-degree;
//		}
//		
//	}
//	
	public Bullet(String imgpath) {
		this.img=GameUtil.getImage(imgpath);
		degree=Math.random()*Math.PI*2;
		this.x=Constant.GAME_HEIGHT/2;
		this.y=Constant.GAME_WIDTH/2;
		this.width=10;
		this.height=10;
	}

	public void draw(Graphics g) {
		g.drawImage(img, (int)x,(int)y,null);
		
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
	
		if (y>Constant.GAME_HEIGHT-height||y<30) {
			degree=-degree;
		}
		if (x<0||x>Constant.GAME_WIDTH-width) {
			degree=Math.PI-degree;
		}
	
}
	
	
	
}
