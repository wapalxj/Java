package CC15_5_Works;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * 判断单词是否对称:LinkedList出栈顺序即是队列顺序（栈顶是队头）
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
			System.out.println("队列的第一个元素:"+list.peekFirst());
			System.out.println("队列的最后一个元素:"+list.peekLast());
			if (list.peekFirst().equals(list.peekLast())) {
				list.pop();
				list.pollLast();
			}
			else break;
		}
		if (list.size()<=1) {
			System.out.println(word+": 是对称的！");
		}else{
			System.out.println(word+": 不是对称的！");
		}
		
		
		
	}

}
