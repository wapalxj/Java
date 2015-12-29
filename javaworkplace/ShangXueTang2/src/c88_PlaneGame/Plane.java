package c88_PlaneGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Plane extends GameObject{
	
	private boolean left,up,right,down;
	
	private boolean isLive=true;
	
	double width,height;
	
	public Plane () {
		
	}

	public Plane(String imgpath, double x, double y) {
		super();
		this.img = GameUtil.getImage(imgpath);
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
		this.x = x;
		this.y = y;
	}
	


	
	public void draw(Graphics g) {
		if (isLive) {
			g.drawImage(img, (int)x,(int)y,null);
			move();	
		}
		
	}

	public void move() {

		if (left) {
			x-=speed;
		}
		if (right) {
			x+=speed;
		}
		if (up) {
			y-=speed;
		}
		if (down) {
			y+=speed;
		}
	}
	public void direction (KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			this.left=true;
			break;
		case KeyEvent.VK_UP:
			this.up=true;
			break;	
		case KeyEvent.VK_RIGHT:
			this.right=true;
			break;
		case KeyEvent.VK_DOWN:
			this.down=true;
			break;
		default:
			break;
		}
	}
	
	public void minusDir(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			this.left=false;
			break;
		case KeyEvent.VK_UP:
			this.up=false;
			break;	
		case KeyEvent.VK_RIGHT:
			this.right=false;
			break;
		case KeyEvent.VK_DOWN:
			this.down=false;
			break;
		default:
			break;
		}
	}

	public boolean isLive() {
		return this.isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}
	

		
	
}
	
	

