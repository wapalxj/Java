package c99_Collection;

public class Node {
	 Node previous;
	 Object obj;
	 Node next;
	
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
