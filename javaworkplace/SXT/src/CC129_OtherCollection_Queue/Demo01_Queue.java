package CC129_OtherCollection_Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * 队列模拟银行存款
 */
public class Demo01_Queue {

	public static void main(String[] args) {
		Queue<Request> que =new ArrayDeque<>();
		for (int i = 0; i < 10; i++) {
			final int num =i;//你们内部类只能访问final修饰的对象
			que.offer(new Request(){
				public void deposit() {
					System.out.println("第"+num+"个人的存款为："+Math.random()*10000);
				}
			});
		}
		deal(que);
	}
	//处理存款业务
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