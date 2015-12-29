package c88_PlaneGame;

import java.awt.Graphics;
import java.awt.Image;

public class Explode {
	double x,y;
	static Image[] imgs =new Image [32];
	int count;
	
	static {
		for (int i = 0; i < 32; i++) {
			imgs[i]=GameUtil.getImage("explode/fire"+(i+1)+".jpg");
			imgs[i].getWidth(null);	
		}
	}
	
	public Explode(double x,double y) {
		this.x=x;
		this.y=y;
	}

	public void draw(Graphics g) {
		if (count<=31) {
			g.drawImage(imgs[count], (int)x, (int)y, null);		
			count++;
		}
		
	}
}
