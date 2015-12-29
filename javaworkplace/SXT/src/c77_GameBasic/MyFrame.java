package c77_GameBasic;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import c77_GameBasic.GameFrame.PaintThread;

public class MyFrame extends Frame{

	
	/**
	 * loading
	 */
	public void launchFrame() {
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
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
	
}
