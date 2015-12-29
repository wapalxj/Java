package CC177_Thread4_priority;


public class T3_SynThread {

	public static void main(String[] args) {
		Web12306 w=new Web12306();
		
		Thread p1=new Thread(w,"��ţ1");
		Thread p2=new Thread(w,"��ţ2");
		Thread p3=new Thread(w,"��ţ3");
		
		p1.start();
		p2.start();
		p3.start();
	}

}
class Web12306 implements Runnable{
	private int num=10;
	private boolean flag=true;
	public void run(){
		while (flag) {
//			test1();//�̲߳���ȫ��
//			test2();//�̰߳�ȫ��:ͬ������
//			test3();//�̰߳�ȫ��:ͬ����
			test4();
		}
	}
	//�̲߳���ȫ��
	public void  test1() {
		if (num<=0) {
			this.flag=false;
			return;
		}
		try {
			Thread.sleep(500);//������ʱ���ᵼ�½�����ܲ�׼ȷ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"������"+num--);
	
	}
	//�̰߳�ȫ:ͬ������
	public synchronized void  test2() {
		if (num<=0) {
			this.flag=false;
			return;
		}
		try {
			Thread.sleep(500);//������ʱ���ᵼ�½�����ܲ�׼ȷ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"������"+num--);
	
	}
	
	//�̰߳�ȫ:ͬ����
		public  void  test3() {
			synchronized(this){
				if (num<=0) {
					this.flag=false;
					return;
				}
				try {
					Thread.sleep(500);//������ʱ���ᵼ�½�����ܲ�׼ȷ
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"������"+num--);
			}
		}
		
	//�̲߳���ȫ:
	public  void  test4() {
		synchronized((Integer)num){
			if (num<=0) {
				this.flag=false;
				return;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}
	}
}
	
