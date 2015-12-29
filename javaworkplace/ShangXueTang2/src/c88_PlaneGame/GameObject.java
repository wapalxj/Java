package c88_PlaneGame;

import java.awt.Image;
import java.awt.Rectangle;

public class GameObject {
	Image img;
	double x,y;
	double speed=5;
	int width;
	int height;
	//获取飞机所在矩形：用于碰撞检测
	
	public GameObject () {
		
	}

	public GameObject(Image img, double x, double y, double speed, int width,
			int height) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}
	public  Rectangle getRect() {
		return new Rectangle((int)x,(int)y,img.getWidth(null),img.getHeight(null));
	}
	
}
