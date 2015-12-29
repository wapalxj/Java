package c88_PlaneGame;
import java.util.Date;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class PlaneFrame extends MyFrame{
	Image bg =GameUtil.getImage("images_Solar/bg.jpg");
	Plane p =new Plane("images_p/Player.png",100,100);
	
	ArrayList bulletList =new ArrayList();//泛型
	Date startTime;
	Date endTime;
	
	Explode bao ;//爆炸
	
	/**
	 * 这个方法是由 java 的 GUI 内部机制自己调用的
总结来说，就是当界面刷新时，java GUI 机制会生成一个 paint 事件
最终调用到 paint 方法
	 */
	public void paint(Graphics g) {
		g.drawImage(bg,0,0,null);
		this.p.draw(g);
	
		//画出子弹
		for (int i = 0; i < bulletList.size(); i++) {
			Bullet b =(Bullet)bulletList.get(i);
			b.draw(g);
		
			//检测跟飞机的碰撞
			boolean peng =b.getRect().intersects(p.getRect());	
			//判断碰撞
			if(peng&&p.isLive()){
				p.setLive(false);
				endTime=new Date();
				if (this.bao==null){
					this.bao=new Explode(50, 50);//爆炸	
					this.bao.draw(g);
				}	
			}
			
		}		
		//打印结束
		if (!p.isLive()) {
//			printInfo(g,"GAME OVER",50,100,200,Color.white);
			int period =(int)((endTime.getTime()-startTime.getTime())/1000);
			printInfo(g, "生存时间： "+period, 20, 120, 250, Color.RED);
		
		
		switch (period/10) {
		case 0:
		case 1:
			printInfo(g,"菜鸟",50,100,200,Color.white);
			break;
		case 2:
			printInfo(g,"小鸟",50,100,200,Color.white);
			break;
		case 3:
			printInfo(g,"大鸟",50,100,200,Color.white);
			break;
		case 4:
			printInfo(g,"鸟王子",50,100,200,Color.white);
			break;
		default:
			break;
		}
		
		}
//		printInfo(g, "分数：0", 50, 10, 50, Color.yellow);
	}
	//打印信息
	public void printInfo(Graphics g,String str,int size,int x,int y,Color color) {
		Color c=g.getColor();
		g.setColor(color);
		Font f =new Font("宋体",Font.BOLD,size);
		g.setFont(f);
		g.drawString(str,x,y);
		g.setColor(c);
}
	
	/**
	 * 利用双缓冲消除闪烁(仅AWT中使用)(也可以将此代码粘到MyFrame中)
	 */
	
	private Image offScreenImage =null;
	public void update(Graphics g) {
		if(offScreenImage==null){
			offScreenImage=this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		}	
		
		Graphics gOff =offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0,0, null);
		
	}

	public static void main(String[] args) {
		new PlaneFrame().launchFrame();
	}
	/**
	 * 生成窗口
	 */
	public void launchFrame() {
		super.launchFrame();
		//增加键盘监听
		addKeyListener(new KeyMonitor());
		
		//生成一堆子弹
		for (int i = 0; i < 50; i++) {
			Bullet b=new Bullet("images_p/tou2.png");
			bulletList.add(b);
		}
		
		startTime = new Date();
	
	}

	/**
	 * 内部类:方便使用外部类的p
	 * @author Administrator
	 *
	 */
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("按下："+e.getKeyCode());
			p.direction(e);	
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("释放："+e.getKeyCode());
			p.minusDir(e);
		
		}


	}
}