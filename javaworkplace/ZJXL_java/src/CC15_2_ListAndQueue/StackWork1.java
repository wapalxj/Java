package CC15_2_ListAndQueue;
import java.util.Scanner;
/*
 *Stack��ҵ1:����һ�������������,��ϰ����ƥ��
 *	
 */
import java.util.Stack;

import CC13_DS.StackComposition;

public class StackWork1 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		//���������
//		Stack<Integer> s =new Stack<>();
//		System.out.println("������һ�������� ");
//		int n=in.nextInt();
//		System.out.println(n+"�Ķ��������ǣ� ");
//		while (n!=0) {
//		s.push(n%2);
//		n=n/2;
//		}
//		while (!s.empty()) {
//			System.out.print(s.pop());
//		}
//		System.out.println();
		
		//����ƥ��
		Stack<String>  table = new Stack<String>();
		System.out.println("������һ��һ��������( ) [ ] { }���ַ��� ");
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
