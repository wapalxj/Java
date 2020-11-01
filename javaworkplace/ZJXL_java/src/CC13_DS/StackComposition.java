package CC13_DS;

//StackComposition.java
//Class StackComposition definition with composed testList object
/*
 * �����ʵ��ջ
 */

public class StackComposition {
	private List s;
	
	public StackComposition() {
		s = new List( "stack" ); 
	}
	public void push( Object o ){ 
		s.insertAtFront( o ); 
	}
	public Object pop() throws EmptyListException{
		return s.removeFromFront(); 
	}
	public boolean isEmpty() {
		return s.isEmpty(); 
	}
	public void print() { 
		s.print();
	}
	public ListNode getTop() {
		return s.getFirst();
	}
}
