package C10_Generatic_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * ͨ���������ƥ���κ�һ�����ͼ��ϣ���
 * @author Administrator
 *
 */
public class TongPei {
	public static void main(String[] args) {
		List<String> st=new ArrayList<String>();
		st.add("aaaaaa");
		st.add("222222");
		st.add("vvvvvvvv");
		printList(st);
		
		
		/**
		 * JDK����һ����������������Ĵ����ǶԵ�
	interface Collection<E>{
		public boolean addAll(Collection<? extends E> c) {
			
		}
	}*/
		List<Number> nums =new ArrayList<Number>();
		List<Integer> ints =Arrays.asList(1,2);
		List<Double> dbls =Arrays.asList(2.78,3.14);
		nums.addAll(ints);
		nums.addAll(dbls);
		
	}
	
	public static void printList(List<?> lst) {
		for (Object item : lst) {
			System.out.println(item);
		}
	}
}

