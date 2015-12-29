package CC13_DS;

import java.util.Scanner;

public class ListWork1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List2 table =new List2();
		table.createTable("I am a good boy");
		table.print();
		System.out.println(table.getSize());
		System.out.println(table.getWord("a"));
	}

}
// Class List definition
class List2 {
	private ListNode firstNode;
	private ListNode lastNode;
	private String name; // String like "list" used in printing
	private String []words;
	private int size;
	// Constructor: Construct an empty List with s as the name
	public List2(String s) {
		name = s;
		firstNode = lastNode = null;
	}

	// Constructor: Construct an empty List with
	// "list" as the name
	public List2() {
		this("table");
	}
	
	public synchronized void createTable(String sentence) {
		words=sentence.split(" ");
		if (isEmpty()){
			firstNode = lastNode = new ListNode(words[0]);size++;
			for (int i = 1; i < words.length; i++) {
				insertAtBack(words[i]);
			}	
		}
		lastNode.next=firstNode;
	}
	
	public synchronized void insertAtBack(String insertItem) {
		if (isEmpty())
			firstNode = lastNode = new ListNode(insertItem);
		else
			lastNode = lastNode.next = new ListNode(insertItem);
		size++;
		lastNode.next=firstNode;
		
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
		ListNode current = firstNode;
		int pos=0;
		if (current.getObject().equals(word)) {
			return pos;
		}
		for (pos = 0; !current.getObject().equals(word); pos++) {
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

		ListNode current = firstNode;
		System.out.print(current.data.toString() + " ");
		current = current.next;
		
		for (int i = 0; current!= firstNode; current = current.next) {
			System.out.print(current.data.toString() + " ");	
		}


		System.out.println("\n");
	}
}
