package C11_collection;

import java.util.LinkedList;

public class P231_Ex15_Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Character> stack=new Stack<>();
		String str="+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u-+l+e+s";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			switch (ch) {
			case '+':
				stack.push(str.charAt(++i));
				break;
			case '-':
				stack.pop();
				break;
			default:
				break;
			}
		}
		System.out.println(stack);
	}

}

class Stack<T>{
	private LinkedList<T> storage =new LinkedList<>();
	public void push(T  v) {
		storage.addFirst(v);
	}
	
	public T peek() {
		return storage.getFirst();
	}
	
	public T pop() {
		return storage.pop();
	}
	
	public boolean empty() {
		return storage.isEmpty();
	}
	@Override
	public String toString() {
		return storage.toString();
	}
}
