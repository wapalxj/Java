package cc116_Generic;
/**
 * ���ͽӿ�:��̳�ͬ��
 * @author Administrator
 *
 * @param <T>
 */
public interface Comparable<T> {
	void compare(T t);
}
//���������������
class Comp4<T> implements Comparable<Integer>{
	public void compare(Integer t) {
		
	}
}

//������
class Comp1 implements Comparable{
	public void compare(Object t) {
		
	}
}
//������������෺��
class Comp2<T> implements Comparable{
	public void compare(Object t) {
		
	}
}
//���෺�͡�=���෺��
class Comp3<T> implements Comparable<T>{
	public void compare(T t) {
		
	}
}
//���෺�ͣ������������
//class Comp6 implements Comparable<T>{
//	
//}