package CC174_Thread3_state;

public class Demo01_stop {

	public static void main(String[] args) {
		Study s=new Study();
		new Thread(s).start();
		//�ⲿ����
		for (int i = 0; i < 1000; i++) {
			if (i==500) {
				s.Stop();
			}
			System.out.println("main,,,"+i);
		}
	}
}

class Study implements Runnable{
	private boolean flag=true;//1.�߳����� ���� �߳���ʹ�ñ�ʶ
	@Override
	public void run() {
		while (flag) {//2.�߳���ʹ�øñ�ʶ
			System.out.println("vero is studying,,,");
		}
	}
	public void Stop() {//3.�����ṩ�����ı��ʶ
		this.flag=false;
	}
}