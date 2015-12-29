package CC15_2_ListAndQueue;
import java.util.Scanner;
/*
 *Stack作业1:输入一个数求二进制数,复习括号匹配
 *	
 */
import java.util.Stack;

import CC13_DS.StackComposition;

public class StackWork1 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		//求二进制数
//		Stack<Integer> s =new Stack<>();
//		System.out.println("请输入一个整数： ");
//		int n=in.nextInt();
//		System.out.println(n+"的二进制数是： ");
//		while (n!=0) {
//		s.push(n%2);
//		n=n/2;
//		}
//		while (!s.empty()) {
//			System.out.print(s.pop());
//		}
//		System.out.println();
		
		//括号匹配
		Stack<String>  table = new Stack<String>();
		System.out.println("请输入一个一串仅包含( ) [ ] { }的字符： ");
		String sequences=in.nextLine();
		String []seqs=sequences.split("");
		table.push(seqs[0]);
		for (int i = 1; i < seqs.length; i++) {
			String next=table.peek();
			table.push(seqs[i]);
			if ((table.peek().equals(")")&&next.equals("("))||
				(table.peek().equals("]")&&next.equals("["))||
				(table.peek().equals("}")&&next.equals("{"))
				) {
				table.pop();
				table.pop();
			}
		}
		if(table.isEmpty()){
			System.out.println("good!");
		}
		else {
			System.out.println("no!");
		}
	}

}
