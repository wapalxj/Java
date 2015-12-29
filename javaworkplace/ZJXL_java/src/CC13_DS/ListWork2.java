package CC13_DS;

import java.util.Scanner;

public class ListWork2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List3 table =new List3();
		table.createTable("I am a good boy");
		table.print();
		
		System.out.println(table.getSize());
		System.out.println(table.getWord("a"));
		
		table.rePrint();
	}

}

class ListNode2 {
	// package access data so class List can access it directly
	Object data;
	ListNode2 next;
	ListNode2 pre;
	// Constructor: Create a ListNode that refers to Object o.
	ListNode2(Object o) {
		this(o, null,null);
	}

	// Constructor: Create a ListNode that refers to Object o and
	// to the next ListNode in the List.
	ListNode2(Object o, ListNode2 nextNode,ListNode2 preNode) {
		data = o; // this node refers to Object o
		next = nextNode; // set next to refer to next
		pre=preNode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ListNode2 getNext() {
		return next;
	}

	public void setNext(ListNode2 next) {
		this.next = next;
	}

	public ListNode2 getPre() {
		return pre;
	}

	public void setPre(ListNode2 pre) {
		this.pre = pre;
	}

	public Object getObj() {
		// TODO Auto-generated method stub
		return null;
	}

}
// Class List definition
class List3 {
	private ListNode2 firstNode;
	private ListNode2 lastNode;
	private String name; // String like "list" used in printing
	private String []words;
	private int size;
	// Constructor: Construct an empty List with s as the name
	public List3(String s) {
		name = s;
		firstNode = lastNode = null;
	}

	// Constructor: Construct an empty List with
	// "list" as the name
	public List3() {
		this("table");
	}
	
	public synchronized void createTable(String sentence) {
		words=sentence.split(" ");
		if (isEmpty()){
			firstNode = lastNode = new ListNode2(words[0]);size++;
			for (int i = 1; i < words.length; i++) {
				insertAtBack(words[i]);
			}	
		}
		lastNode.next=firstNode;
		firstNode.pre=lastNode;
	}
	
	public synchronized void insertAtBack(String insertItem) {
		if (isEmpty())
			firstNode = lastNode = new ListNode2(insertItem);
		else{
			lastNode = lastNode.next = new ListNode2(insertItem,null,lastNode);
		}
			
			
		size++;
		lastNode.next=firstNode;
		firstNode.pre=lastNode;
	}

	
	// Return true if the List is empty
	public synchronized boolean isEmpty() {
		return firstNode == null;
	}
	public int getSize() {
		return size;
	}
	public int getWord(String word) {
		if (isEmpty()) {
			System.out.println("Empty " + name);
			return -1;
		}
		ListNode2 current = firstNode;
		int pos=0;
		if (current.getData().equals(word)) {
			return pos;
		}
		for (pos = 0; !current.getData().equals(word); pos++) {
			 current = current.next;
		}
		return pos;
	}
	// Output the List contents
	public synchronized void print() {
		if (isEmpty()) {
			System.out.println("Empty " + name);
			return;
		}

		System.out.print("The " + name + " is: ");

		ListNode2 current = firstNode;
		System.out.print(current.data.toString() + " ");//打印最后一个字符
		current = current.next;
		
		for (int i = 0; current!= firstNode; current = current.next) {
			System.out.print(current.data.toString() + " ");	
		}


		System.out.println("\n");
	}
	
	public synchronized void rePrint() {
		if (isEmpty()) {
			System.out.println("Empty " + name);
			return;
		}

		System.out.print("The " + name + " is: ");

		ListNode2 current = lastNode;

		for (int i = 0; current!= firstNode; current = current.pre) {
			System.out.print(current.data.toString() + " ");	
		}
		
		System.out.print(current.data.toString() + " ");//打印第一个字符

		System.out.println("\n");
	}
}
