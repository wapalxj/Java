package CC177_Thread4_priority;

/*
 * 单例设计模式：多线程的
 * 现在2个单例对象就可能不是同一个
 */
public class T6_Singgleton_Syn2 {

	public static void main(String[] args) {
		Thread t1=new JvmThread2();
		Thread t2=new JvmThread2();
		t1.start();
		t2.start();
	}

}
class Jvm3{
	private static Jvm3 instance=null;
	
	private Jvm3(){
		
	}
	//现在多线程也能单例了1:synchronized方法
//	public static synchronized Jvm3 single(){
//		if (instance==null) {
//			instance=new Jvm3();
//		}
//		return instance;
//	}
	
	//现在多线程也能单例了2：synchronized(类.class):效率不高
//	public static  Jvm3 single(){
//		synchronized(Jvm3.class){
//			if (instance==null) {
//				instance=new Jvm3();
//			}
//			return instance;
//		}
//	}
	//现在多线程也能单例了3：synchronized(类.class):效率较高
		public static  Jvm3 single(){
			if (instance==null) {//这一行提高效率，一个线程创建JVM后，后面的线程将不会执行这块代码,相比2要效率高
				synchronized(Jvm3.class){
					if (instance==null) {//单例
						instance=new Jvm3();
					}					
				}
			}
			return instance;
		}
}

class JvmThread2 extends Thread{
	public JvmThread2() {
		
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->"+Jvm3.single());
	}
}