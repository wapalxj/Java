package CC15_5_Works;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * �жϵ����Ƿ�Գ�:LinkedList��ջ˳���Ƕ���˳��ջ���Ƕ�ͷ��
 */
public class Co6_SymmetricalWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="abcba";
		LinkedList<String> list =new LinkedList<>();
		
		String[]chars =word.split("");
		for (String string : chars) {
			list.push(string);
		}
		
//		Iterator<String> it= list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for (list.peekFirst();list.peekFirst()!=list.peekLast();) {
			System.out.println("���еĵ�һ��Ԫ��:"+list.peekFirst());
			System.out.println("���е����һ��Ԫ��:"+list.peekLast());
			if (list.peekFirst().equals(list.peekLast())) {
				list.pop();
				list.pollLast();
			}
			else break;
		}
		if (list.size()<=1) {
			System.out.println(word+": �ǶԳƵģ�");
		}else{
			System.out.println(word+": ���ǶԳƵģ�");
		}
		
		
		
	}

}
