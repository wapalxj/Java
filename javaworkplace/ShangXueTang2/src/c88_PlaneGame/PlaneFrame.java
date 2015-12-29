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
	
	ArrayList bulletList =new ArrayList();//����
	Date startTime;
	Date endTime;
	
	Explode bao ;//��ը
	
	/**
	 * ����������� java �� GUI �ڲ������Լ����õ�
�ܽ���˵�����ǵ�����ˢ��ʱ��java GUI ���ƻ�����һ�� paint �¼�
���յ��õ� paint ����
	 */
	public void paint(Graphics g) {
		g.drawImage(bg,0,0,null);
		this.p.draw(g);
	
		//�����ӵ�
		for (int i = 0; i < bulletList.size(); i++) {
			Bullet b =(Bullet)bulletList.get(i);
			b.draw(g);
		
			//�����ɻ�����ײ
			boolean peng =b.getRect().intersects(p.getRect());	
			//�ж���ײ
			if(peng&&p.isLive()){
				p.setLive(false);
				endTime=new Date();
				if (this.bao==null){
					this.bao=new Explode(50, 50);//��ը	
					this.bao.draw(g);
				}	
			}
			
		}		
		//��ӡ����
		if (!p.isLive()) {
//			printInfo(g,"GAME OVER",50,100,200,Color.white);
			int period =(int)((endTime.getTime()-startTime.getTime())/1000);
			printInfo(g, "����ʱ�䣺 "+period, 20, 120, 250, Color.RED);
		
		
		switch (period/10) {
		case 0:
		case 1:
			printInfo(g,"����",50,100,200,Color.white);
			break;
		case 2:
			printInfo(g,"С��",50,100,200,Color.white);
			break;
		case 3:
			printInfo(g,"����",50,100,200,Color.white);
			break;
		case 4:
			printInfo(g,"������",50,100,200,Color.white);
			break;
		default:
			break;
		}
		
		}
//		printInfo(g, "������0", 50, 10, 50, Color.yellow);
	}
	//��ӡ��Ϣ
	public void printInfo(Graphics g,String str,int size,int x,int y,Color color) {
		Color c=g.getColor();
		g.setColor(color);
		Font f =new Font("����",Font.BOLD,size);
		g.setFont(f);
		g.drawString(str,x,y);
		g.setColor(c);
}
	
	/**
	 * ����˫����������˸(��AWT��ʹ��)(Ҳ���Խ��˴���ճ��MyFrame��)
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
	 * ���ɴ���
	 */
	public void launchFrame() {
		super.launchFrame();
		//���Ӽ��̼���
		addKeyListener(new KeyMonitor());
		
		//����һ���ӵ�
		for (int i = 0; i < 50; i++) {
			Bullet b=new Bullet("images_p/tou2.png");
			bulletList.add(b);
		}
		
		startTime = new Date();
	
	}

	/**
	 * �ڲ���:����ʹ���ⲿ���p
	 * @author Administrator
	 *
	 */
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("���£�"+e.getKeyCode());
			p.direction(e);	
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("�ͷţ�"+e.getKeyCode());
			p.minusDir(e);
		
		}


	}
}