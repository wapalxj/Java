package CC174_Thread3_state;

public class Demo02_yield {

	public static void main(String[] args) {
		Dyield demo=new Dyield();
		Thread t=new Thread(demo);
		t.start();//����
		
		for (int i = 0; i < 100; i++) {
			if (i==50) {
				//��ͣmain�߳�
				Thread.yield();
			}
			System.out.println("main,,,"+i);
		}
	}

}
class Dyield extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("yield,,,"+i);
		}
	}
}