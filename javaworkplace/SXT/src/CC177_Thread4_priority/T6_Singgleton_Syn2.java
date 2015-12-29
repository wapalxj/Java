package CC177_Thread4_priority;

/*
 * �������ģʽ�����̵߳�
 * ����2����������Ϳ��ܲ���ͬһ��
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
	//���ڶ��߳�Ҳ�ܵ�����1:synchronized����
//	public static synchronized Jvm3 single(){
//		if (instance==null) {
//			instance=new Jvm3();
//		}
//		return instance;
//	}
	
	//���ڶ��߳�Ҳ�ܵ�����2��synchronized(��.class):Ч�ʲ���
//	public static  Jvm3 single(){
//		synchronized(Jvm3.class){
//			if (instance==null) {
//				instance=new Jvm3();
//			}
//			return instance;
//		}
//	}
	//���ڶ��߳�Ҳ�ܵ�����3��synchronized(��.class):Ч�ʽϸ�
		public static  Jvm3 single(){
			if (instance==null) {//��һ�����Ч�ʣ�һ���̴߳���JVM�󣬺�����߳̽�����ִ��������,���2ҪЧ�ʸ�
				synchronized(Jvm3.class){
					if (instance==null) {//����
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