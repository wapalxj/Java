package CC177_Thread4_priority;

/*
 * 单例设计模式：多线程的
 * 现在2个单例对象就可能不是同一个
 */
public class T5_Singgleton_Syn {

	public static void main(String[] args) {
		Thread t1=new JvmThread();
		Thread t2=new JvmThread();
		t1.start();
		t2.start();
	}

}
class Jvm2{
	private static Jvm2 instance=null;
	
	private Jvm2(){
		
	}
	public static Jvm2 single(){
		if (instance==null) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			instance=new Jvm2();
		}
		return instance;
	}
}

class JvmThread extends Thread{
	public JvmThread() {
		
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->"+Jvm2.single());
	}
}