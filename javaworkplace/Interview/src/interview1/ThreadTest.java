package interview1;

import java.util.LinkedList;

/**
 * 面试的题目
 */
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
			this.linkedList.addLast("���ҽ���");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���ҽ���");
			
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
			this.linkedList.addLast("���ҳ�ȥ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���ҳ�ȥ");
		}
		
	}
}
