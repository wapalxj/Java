package CC174_Thread3_state;


/*
 * sleepģ��������ʱ
 */
public class Demo05_sleep_test2 {

	public static void main(String[] args) {
		//��ʵ��ɫ
				Web12306 w=new Web12306();
				
				Thread t1=new Thread(w,"��ţ1");
				Thread t2=new Thread(w,"��ţ2");
				Thread t3=new Thread(w,"��ţ3");
				
				t1.start();
				t2.start();
				t3.start();
	}

}

class Web12306 implements Runnable{
	private int num=10;
	public void run(){
		while (true) {
			if (num<=0) {
				break;
			}
			try {
				Thread.sleep(500);//������ʱ���ᵼ�½�����ܲ�׼ȷ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}
	}
}

