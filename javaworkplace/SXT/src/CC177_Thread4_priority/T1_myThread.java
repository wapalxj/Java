package CC177_Thread4_priority;

import c37.This;

public class T1_myThread {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Thread.currentThread().getName());
		MyThread t1=new MyThread();
		//若不取名it,则会自动编号一个名字：Thread-0
		Thread proxy =new Thread(t1,"it");
		System.out.println(proxy.getName());
		
		proxy.setName("iiiiiiiiit");
		System.out.println(proxy.getName());
		
		proxy.start();
		
		System.out.println("启动后的状态："+proxy.isAlive());
		
		Thread.sleep(20);
		t1.stop();
		Thread.sleep(100);
		
		System.out.println("停止后的状态："+proxy.isAlive());
	}

}
class MyThread implements Runnable{
	private boolean flag=true;
	private int num=0;
	
	@Override
	public void run() {
		while (flag) {
			System.out.println(Thread.currentThread().getName()+"-->"+num++);
		}
	}
	
	public void stop() {
		setFlag(false);
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}