package c77_GameBasic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * 游戏窗口类
 * @param args
 */
public class GameFrame extends Frame{
	Image img =GameUtil.getImage("images/pin.png") ;
	
	
	
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
	@Override
	public void paint(Graphics g) {
		System.out.println("!!!");
		g.drawLine(100, 100, 200, 200);
		g.setColor(Color.RED);
		g.drawRect(100, 100, 200, 200);
		
		Font f=new Font("宋体",Font.BOLD,100);
		g.setFont(f);
		g.drawString("qwe", 200, 200);
		
		g.drawImage(img, (int)x,(int)y,null);
		
		x+=3;
		y+=3;
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
		GameFrame gf=new GameFrame();
		gf.launchFrame();
		
	}

}
