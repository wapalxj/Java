package CC174_Thread3_state;
/*
 * join:合并线程:当main的i=50时，线程合并，此时main阻塞，t执行完才继续执行main中的
 */
public class Demo02_join extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Djoin demo=new Djoin();
		Thread t=new Thread(demo);
		t.start();//进入就绪
		for (int i = 0; i < 100; i++) {
			if (i==50) {
				t.join();
			}
			System.out.println("main,,,"+i);
		}

	}
}
class Djoin extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("join,,,"+i);
		}
	}
}
