package CC174_Thread3_state;
/*
 * join:�ϲ��߳�:��main��i=50ʱ���̺߳ϲ�����ʱmain������tִ����ż���ִ��main�е�
 */
public class Demo02_join extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Djoin demo=new Djoin();
		Thread t=new Thread(demo);
		t.start();//�������
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
