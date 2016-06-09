package CC169_Thread;

public class T1_myThread {
	//主线程
	public static void main(String[] args) throws InterruptedException {
		//多线程1
		Animal rabbit=new Animal();
		//多线程2
		Animal pig=new Animal();
		rabbit.start();//启动线程
		Thread.sleep(3000);
		rabbit.start();//启动线程:不能启动多次
		pig.start();//启动线程
		
//		for(int i=0;i<100;i++){
//			System.out.println("main=>>"+i);
//		}
	}

}

class Animal extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("跑了"+i+"步");
		}
	}
}