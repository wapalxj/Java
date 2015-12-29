package CC180_Thread5_deadlock;

public class T2_Movie1 {

	public static void main(String[] args) {
		Movie m=new Movie();
		//2���߳�ʹ��һ����Դ
		Player p= new Player(m);
		Watcher w=new Watcher(m);
		
		new Thread(p).start();
		new Thread(w).start();

	}

}

//����
class Movie{
	private String pic;
	public  void play(String pic) {
		this.pic=pic;
	}
	public  void watch() {
		System.out.println(pic);
	}
}
//������
class Player implements Runnable{
	private Movie m;
	public Player(Movie m) {
		this.m=m;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (0==i%2) {
				m.play("ppppppppppp  "+i);
			}else {
				m.play("wwwwwwwwwwwww  "+i);
			}
		}
	}
}
//������
class Watcher implements Runnable{
	private Movie m;
	
	public Watcher(Movie m) {
		this.m=m;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			m.watch();
		}
	}
	
}