package cc116_Generic;

import java.io.Closeable;
import java.io.IOException;

/**
 * ���ͷ���:
 * ���η�<>��������
 * ֻ�ܷ��ʶ������Ϣ�������޸ģ���Ϊ����ʱ��"a"����(t a)��ʱ��������ʵû��ȷ��
 * @author Administrator
 *
 */
public class TestMethod<T> {
	
	public static void main(String[] args) {
		test("a");

	}

	public static <T> void test(T a) {//��̬������ǰ���T��ʾ����������T�����������õ����ͣ��������T�����޶�����Ĭ�Ͽ���ʹ�����еĶ��󣬷Ǿ�̬��������ָ��Ҳ���Բ�ָ��
//		a.set();//�޷�����a�ķ�����ֻ�ܷ��ʶ������Ϣ�������޸�
		System.out.println(a);
	}
	public static <T extends Closeable> void test(T... a) {//��ʾTֻ����Closeable�ӿڵ�ʵ���࣬T...��ʾ�ɱ����
		for (T temp:a) {
			try {
				if(null!=temp){
					temp.close();	
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		System.out.println(a);
	}

}
