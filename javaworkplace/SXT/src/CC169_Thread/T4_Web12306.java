package CC169_Thread;

import c54_stri.Str;

public class T4_Web12306 {

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
//	public static void main(String[] args) {
//		WebWhole w1=new WebWhole("vero1");
//		WebWhole w2=new WebWhole("vero2");
//		WebWhole w3=new WebWhole("vero3");
//		w1.start();
//		w2.start();
//		w3.start();
//	}
}

class Web12306 implements Runnable{
	private int num=10;
	public void run(){
		while (true) {
			if (num<=0) {
				break;
			}
			System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
		}
	}
}

class WebWhole extends Thread{
	
	private String name;
	private int num=10; 
	public WebWhole(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		while (true) {
			if (num<=0) {
				break;
			}
			System.out.println(this.getName1()+"抢到了"+num--);
		}
	}
	
	public String getName1() {
		return name;
	}
	
	
}
