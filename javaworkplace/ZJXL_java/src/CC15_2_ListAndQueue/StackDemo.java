package CC15_2_ListAndQueue;

import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
	      names.push("Raymond");
	      names.push("David");
	      System.out.println("Top of stack: " + names.peek());
	      names.pop();
	      System.out.println("Top of stack: " + names.peek());
	      names.push("Cynthia");
	      System.out.println("Top of stack: " + names.peek());
	      //如果堆栈为空，再次pop会抛出EmptyStackException
	      if (!names.empty()) {
	         names.pop();
	      }
	      System.out.println("Top of stack: " + names.peek());
	      names.pop();
	      if (!names.empty()) {
	         System.out.println("Top of stack: " + names.peek());
	      } else {
	         System.out.println("Stack empty.");
	      }
		
	}

}

