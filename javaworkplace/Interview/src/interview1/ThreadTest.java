package interview1;

import java.util.LinkedList;


public class ThreadTest {

	public static void main(String[] args) {
		LinkedList<String> linkedList =new LinkedList<String>();
		Thread A=new Thread(new ReadData(linkedList));
		Thread B=new Thread(new WriteData(linkedList));
		A.start();
		B.start();
	}

}
class ReadData  implements Runnable{
	private LinkedList<String> linkedList;
	public ReadData(LinkedList<String> linkedList) {
		this.linkedList=linkedList;
	}
	@Override
	public void run() {
		while (true) {
			this.linkedList.addLast("加我进来");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("加我进来");
			
		}
		
	}
}
class WriteData implements Runnable{
	private LinkedList<String> linkedList;
	public WriteData(LinkedList<String> linkedList) {
		this.linkedList=linkedList;
	}
	@Override
	public void run() {
		while (true) {
			this.linkedList.addLast("放我出去");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("放我出去");
		}
		
	}
}
