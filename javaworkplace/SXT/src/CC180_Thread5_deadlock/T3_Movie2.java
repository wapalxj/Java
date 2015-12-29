package CC180_Thread5_deadlock;

public class T3_Movie2 {

	public static void main(String[] args) {
		Movie2 m=new Movie2();
		
		Player2 p= new Player2(m);
		Watcher2 w=new Watcher2(m);
		
		new Thread(p).start();
		new Thread(w).start();

	}

}

//����
class Movie2{
	private String pic;
	//�źŵ�-->true:���������ɣ������ߵȴ���������ɺ�֪ͨ������
	//�źŵ�-->false:���������ѣ������ߵȴ����������֪ͨ������
	private boolean flag=true;
	
	public synchronized void play(String pic) {
		if (!flag) {//�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(500);//ģ������ʱ��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.pic=pic;
		
		//������ɣ�������ͣ�£�֪ͨ������(����)
		this.notify();
		//ֹͣ����
		this.flag=false;
	}
	public synchronized void watch() {
		if (flag) {//�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(500);//ģ������ʱ��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pic);
		
		//�������,������ͣ�£�֪ͨ������
		this.notify();
		//ֹͣ����
		this.flag=true;
	}
}
//������
class Player2 implements Runnable{
	private Movie2 m;
	public Player2(Movie2 m) {
		this.m=m;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (0==i%2) {
				m.play("��������ppppppppppp");
			}else {
				m.play("�����ѣ�wwwwwwwwwwwww");
			}
		}
	}
	
}
//������
class Watcher2 implements Runnable{
	private Movie2 m;
	
	public Watcher2(Movie2 m) {
		this.m=m;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			m.watch();
		}
	}
	
}