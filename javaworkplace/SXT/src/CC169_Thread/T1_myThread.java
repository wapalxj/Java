package CC169_Thread;

public class T1_myThread {
	//���߳�
	public static void main(String[] args) {
		//���߳�1
		Animal rabbit=new Animal();
		//���߳�2
		Animal pig=new Animal();
		rabbit.start();//�����߳�
		pig.start();//�����߳�
		
		for(int i=0;i<100;i++){
			System.out.println("main=>>"+i);
		}
	}

}

class Animal extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("����"+i+"��");
		}
	}
}