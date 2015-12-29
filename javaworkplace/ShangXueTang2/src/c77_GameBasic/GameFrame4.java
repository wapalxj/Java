package c77_GameBasic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * 游戏窗口，物体沿着轨迹运动
 * @param args
 */
public class GameFrame4 extends Frame{
	Image img =GameUtil.getImage("images/tou.png") ;
	
	
	
	public void launchFrame() {
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();//启动重绘线程
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});

	}
	
	private double x=100,y=100;
	private double degree=3.14/3;//[0,2pi]
	private double speed=10;
	@Override
	public void paint(Graphics g) {
	
		g.drawImage(img, (int)x,(int)y,null);
	
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		if (speed>0) {
			speed-=0.05;
		}
		else {
			speed=0;
		}
		if (y>500-50||y<30) {
			degree=-degree;
		}
		if (x<0||x>500-50) {
			degree=Math.PI-degree;
		}
	
	}
	/**
	 * 定义一个重绘线程的内部类
	 * @author Administrator
	 *
	 */
	class PaintThread extends Thread{
		public void run() {
			while(true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame4 gf=new GameFrame4();
		gf.launchFrame();
		
	}

}
