package CC177_Thread4_priority;


public class T3_SynThread {

	public static void main(String[] args) {
		Web12308 w=new Web12308();
		
		Thread p1=new Thread(w,"黄牛1");
		Thread p2=new Thread(w,"黄牛2");
		Thread p3=new Thread(w,"黄牛3");
		
		p1.start();
		p2.start();
		p3.start();
	}

}
class Web12308 implements Runnable{
	private int num=10;
	private boolean flag=true;
	public void run(){
		while (flag) {
//			test1();//线程不安全的
//			test2();//线程安全的:同步方法
//			test3();//线程安全的:同步块
			test4();
		}
	}
	//线程不安全的
	public void  test1() {
		if (num<=0) {
			this.flag=false;
			return;
		}
		try {
			Thread.sleep(500);//增加延时：会导致结果可能不准确
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"抢到了"+num);
		//当线程1和2同时走到这个位置：出现问题
		num--;
	
	}
	//线程安全:同步方法
	public synchronized void  test2() {
		if (num<=0) {
			this.flag=false;
			return;
		}
		try {
			Thread.sleep(500);//增加延时：会导致结果可能不准确
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
	
	}
	
	//线程安全:同步块
		public  void  test3() {
			synchronized(this){
				if (num<=0) {
					this.flag=false;
					return;
				}
				try {
					Thread.sleep(500);//增加延时：会导致结果可能不准确
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"抢到了"+num);
				num--;
			}
		}

	private Integer integer=10;
	//线程不安全:
	public  void  test4() {
//		synchronized((Integer)num){
//			//当线程1和2同时走到这个位置：出现问题：其中1个有锁，而另外1个没有锁：不能改变num
//			if (num<=0) {
//				this.flag=false;
//				return;
//			}
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
//		}


		//线程不安全:
		synchronized((Integer)num){
			if (integer<=0) {
				this.flag=false;
				return;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"抢到了"+integer--);

		}
	}
}
	
