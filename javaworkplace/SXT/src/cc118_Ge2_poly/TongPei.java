package cc118_Ge2_poly;
/**
 * ͨ�������ʹ�ã�
 * ֻ�������������ͺͷ����ϣ������������ʹ��ʱ
 * 
 * ?extends ��ʾ��<=����
 * ��super ��ʾ��>=����
 * @author Administrator
 *
 * @param <T>
 */
//public class TongPei<?>//����
public class TongPei<T> {
	T score;
	
	
	
	
	public static void main(String[] args) {
		TongPei<?> t = new TongPei<String>();
		test(new TongPei<Integer>());
		test2(new TongPei<Apple>());//<=
		//test3(new TongPei<Apple>());//����û�ж�̬
		
		
		//test4(new TongPei<Integer>());//<=
		//test4(new TongPei<Apple>());//<=
		test4(new TongPei<Fruit>());//����
		test4(new TongPei<Object>());//>=
		//test4(t);//ʹ��ʱӦ��ȷ������
	}
	public static void test(TongPei<?> t) {//��?��ΪT�����
		
	}
	//<=
	public static void test2(TongPei<? extends Fruit> t ) {
		
	}
	
	public static void test3(TongPei<Fruit> t ) {
		
	}
	//>=
	public static void test4(TongPei<?super Fruit> t ) {
		
	}
}
