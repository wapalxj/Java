package CC174_Thread3_state;


/*
 * sleep模拟网络延时
 */
public class Demo05_sleep_test2 {

	public static void main(String[] args) {
		//真实角色
				Web12306 w=new Web12306();
				
				Thread t1=new Thread(w,"黄牛1");
				Thread t2=new Thread(w,"黄牛2");
				Thread t3=new Thread(w,"黄牛3");
				
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
				Thread.sleep(500);//增加延时：会导致结果可能不准确
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
		}
	}
}

