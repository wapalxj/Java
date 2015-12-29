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

//场地
class Movie2{
	private String pic;
	//信号灯-->true:生产者生成，消费者等待，生成完成后通知消费者
	//信号灯-->false:消费者消费，生产者等待，消费完成通知生产者
	private boolean flag=true;
	
	public synchronized void play(String pic) {
		if (!flag) {//生产者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//开始生产
		try {
			Thread.sleep(500);//模拟生产时间
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.pic=pic;
		
		//生产完成，生产者停下，通知消费者(唤醒)
		this.notify();
		//停止生产
		this.flag=false;
	}
	public synchronized void watch() {
		if (flag) {//消费者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//开始消费
		try {
			Thread.sleep(500);//模拟消费时间
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pic);
		
		//消费完毕,消费者停下，通知生产者
		this.notify();
		//停止消费
		this.flag=true;
	}
}
//生产者
class Player2 implements Runnable{
	private Movie2 m;
	public Player2(Movie2 m) {
		this.m=m;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (0==i%2) {
				m.play("先生产：ppppppppppp");
			}else {
				m.play("再消费：wwwwwwwwwwwww");
			}
		}
	}
	
}
//消费者
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