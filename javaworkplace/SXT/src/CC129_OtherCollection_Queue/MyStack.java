package CC129_OtherCollection_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * ʹ�ö���ʵ���Զ����ջ
 * 1.��
 * 2.ѹ
 * 3.��ȡͷ
 */
public class MyStack<E> {
	//����
	private Deque<E> container =new ArrayDeque<E>();
	
	//����
	private int capa;

	public MyStack(int capa) {
		super();
		this.capa = capa;
	}
	//ѹջ
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
