package CC15_5_Works;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Co4_yinShu {

	public static void main(String[] args) {
		int sum =54;
		int flag;
		System.out.print(sum+"= ");
//1.不用容器	
//		for (int i = 2; i < 8; i++) {
//			flag=0;
//			if (sum%i==0) {
//				flag=i;
//				sum/=i;
//				i=2;
//
//				System.out.print(flag+"*");
//				
//				continue;
//			}
			
			
//		}
//2.用ArrayList
//		List<Integer> list =new ArrayList<Integer>();
//		for (int i = 2; i < 8; i++) {
//			if (sum%i==0) {
//				list.add(i);
//				sum/=i;
//				i=2;
//				continue;
//			}
//		}
		
//		for (Integer i : list) {
//			System.out.print(i+"*");
//		}
//		Iterator<Integer> it =list.iterator();
//		while (it.hasNext()) {
//			Integer i =it.next();
//			System.out.print(i+"*");
//		}
		
//3.队列
//		LinkedList<Integer> link =new LinkedList<Integer>();
//		for (int i = 2; i < 8; i++) {
//			if (sum%i==0) {
////				link.push(i);//向对头插
//				link.offer(i);//向队尾加
//				sum/=i;
//				i=2;
//				continue;
//			}
//		}
//		Iterator<Integer> it =link.iterator();
//		while (it.hasNext()) {
//			Integer i =it.next();
//			System.out.print(i+"*");
//		}
		
//4.栈
		Stack<Integer> stack =new Stack<Integer>();
		for (int i = 2; i < 8; i++) {
		if (sum%i==0) {
			stack.push(i);
			sum/=i;
			i=2;
			continue;
		}
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop()+"*");
		}
		
	}
		
}