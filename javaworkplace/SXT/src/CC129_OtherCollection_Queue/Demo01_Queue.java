package CC129_OtherCollection_Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * ����ģ�����д��
 */
public class Demo01_Queue {

	public static void main(String[] args) {
		Queue<Request> que =new ArrayDeque<>();
		for (int i = 0; i < 10; i++) {
			final int num =i;//�����ڲ���ֻ�ܷ���final���εĶ���
			que.offer(new Request(){
				public void deposit() {
					System.out.println("��"+num+"���˵Ĵ��Ϊ��"+Math.random()*10000);
				}
			});
		}
		deal(que);
	}
	//������ҵ��
	public static void deal(Queue<Request> que) {
		Request req =null;
		while (null!=(req=que.poll())) {
			req.deposit();	
		}
	}

}
class Request{
	public void deposit() {
		
	}
}