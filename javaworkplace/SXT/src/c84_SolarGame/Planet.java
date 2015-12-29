package c84_SolarGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Planet extends Star{
	/**
	 * 出了图片坐标，行星是运动的:长轴，短轴，速度,围绕物
	 *
	 */
	private double longAxis; 
	private double shortAxis;
	private double speed;
	private double degree;//飞行角度
	private Star center;
	
	public Planet(Star center,String imgpath,double longAxis,
			double shortAxis, double speed) {
		super(GameUtil.getImage(imgpath));
		this.center = center;
		this.x=center.x+longAxis;
		this.y = center.y;

		this.longAxis =longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		
	}
	
	public Planet(Image img, double x, double y) {
		super(img, x, y);
	
	}
	public Planet(String imgpath, double x, double y) {
		super(imgpath, x, y);
	
	}
	
	public void draw (Graphics g) {
		super.draw(g);
		drawTrace(g);
		move();
	}
	public void drawTrace(Graphics g) {
		double ovalx,ovaly,ovalWidth,ovalHeight;
		
		ovalWidth=this.longAxis*2;
		ovalHeight=this.shortAxis*2;
		ovalx=(center.x+center.width/2)-this.longAxis;
		ovaly=(center.y+center.height/2)-this.shortAxis;

		Color c=g.getColor();
		g.setColor(Color.BLUE);
		g.drawOval((int)ovalx, (int)ovaly, (int)ovalWidth, (int)ovalHeight);
		g.setColor(c);
	}
	public void move() {
//		x=(center.x+center.width/2)+longAxis*Math.cos(degree);
//		y=(center.y+center.height/2)+shortAxis*Math.sin(degree);
		
		x=center.x+longAxis*Math.cos(degree);
		y=center.y+shortAxis*Math.sin(degree);
		degree+=speed;
	}

}
