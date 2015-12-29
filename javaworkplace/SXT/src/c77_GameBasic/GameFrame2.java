package c77_GameBasic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * 游戏窗口，物体平行和垂直运动
 * @param args
 */
public class GameFrame2 extends Frame{
	Image img =GameUtil.getImage("images_Solar/pin.png") ;
	
	
	
	public void launchFrame() {
		setSize(1000,1000);
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
	private boolean left;
	private boolean up;
	@Override
	public void paint(Graphics g) {
	
		g.drawImage(img, (int)x,(int)y,null);
		
		if(left){
			x-=3;
		}else {
			x+=3;
		}
		if(x>500-20){
			left=true;
		}
		if (x<0) {
			left =false;
		}
		if(up){
			y-=3;
		}else {
			y+=3;
		}
		if(y>500-20){
			up=true;
		}
		if (y<0) {
			up =false;
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
		GameFrame2 gf=new GameFrame2();
		gf.launchFrame();
		
	}

}
