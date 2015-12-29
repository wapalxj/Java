package CC177_Thread4_priority;
/*
 * ÓÅÏÈ¼¶
 */
public class T2_myThread2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread2 t1=new MyThread2();
		Thread proxy =new Thread(t1,"it1");
		
		MyThread2 t2=new MyThread2();
		Thread proxy2 =new Thread(t2,"it2");
		
		proxy.setPriority(Thread.MIN_PRIORITY);
		proxy2.setPriority(Thread.MAX_PRIORITY);
		proxy.start();
		proxy2.start();
		
		Thread.sleep(100);
		t1.stop();
		t2.stop();
	}

}
class MyThread2 implements Runnable{
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