package cc116_Generic;
/**
 * ����Ϊ������
 * 1.����
 * 2.����
 * ������Ҫôͬʱ������Ҫô����ķ��ʹ��ڵ��ڸ��ࣨ������T1,T2,T3��
 * ����������������෺��
 * ����:
 * �����У��游�����
 * �����У����������
 * 
 * ������д���游�����
 * @author Administrator
 *
 * @param <T>
 */
public abstract class Father<T> {
	T name;
	
	public abstract void test(T t);
		
	
}
/**
 * ��������ʱָ����������
 * ��������Ϊ��������
 * @author Administrator
 *
 */
class Child1 extends Father<String>{
	String t1;
	
	public void test(String t) {//������д���游�����������String
		
	}
}
/**
 * ����Ϊ�����࣬������ʹ��ʱȷ��
 * @author Administrator
 *
 * @param <T1>
 */
class Child2<T> extends Father<T>{
	T t2;
	public void test(T t) {//������д���游�����������T
		
	}
}
/*
 * ����Ϊ�����࣬���಻ָ�����ͣ����͵Ĳ����������ķ���ʹ��Object�滻
 */

class Child3<T,T2,T4> extends Father{
	T t2;
	public void test(Object t) {//������д���游����������������ΪObject
		
	}
}

/*
 * �����븸��ͬʱ����
 */

class Child4 extends Father{
	String name;
	public void test(Object t) {
		
	}
}

/*
 * �����������������ʹ�÷��ͣ��������ڸ��෺�ͣ�
 */
//
//class Child5 extends Father<T>{
//	
//	public void test(Object t) {
//		
//	}
//}