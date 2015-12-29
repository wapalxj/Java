package CC174_Thread3_state;

public class Demo01_stop {

	public static void main(String[] args) {
		Study s=new Study();
		new Thread(s).start();
		//外部干涉
		for (int i = 0; i < 1000; i++) {
			if (i==500) {
				s.Stop();
			}
			System.out.println("main,,,"+i);
		}
	}
}

class Study implements Runnable{
	private boolean flag=true;//1.线程类中 定义 线程体使用标识
	@Override
	public void run() {
		while (flag) {//2.线程体使用该标识
			System.out.println("vero is studying,,,");
		}
	}
	public void Stop() {//3.对外提供方法改变标识
		this.flag=false;
	}
}