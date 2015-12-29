package CC129_OtherCollection_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * 使用队列实现自定义堆栈
 * 1.弹
 * 2.压
 * 3.获取头
 */
public class MyStack<E> {
	//容器
	private Deque<E> container =new ArrayDeque<E>();
	
	//容量
	private int capa;

	public MyStack(int capa) {
		super();
		this.capa = capa;
	}
	//压栈
	public boolean push(E e) {
		if (container.size()+1>capa) {
			return false;
		}
		return container.offerLast(e);
	}
	//
	public E pop() {
		return container.pollLast();
	}
	
	public E peek() {
		return container.peekLast();
	}
	
	public int size() {
		return this.container.size();
	}
}
