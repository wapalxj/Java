package CC13_DS;

public class ListTest {
	public static void main(String args[]) {
		List objList = new List(); // create the testList container

		// Create objects to store in the testList
		Boolean b = Boolean.TRUE;
		Character c = new Character('$');
		Integer i = new Integer(34567);
		String s = "hello";

		// Use the testList insert methods
		objList.insertAtFront(b);
		objList.print();
		objList.insertAtFront(c);
		objList.print();
		objList.insertAtBack(i);
		objList.print();
		objList.insertAtBack(s);
		objList.print();

		// Use the testList remove methods
		Object removedObj;

		try {
			removedObj = objList.removeFromFront();
			System.out.println(removedObj.toString() + " removed");
			objList.print();
			removedObj = objList.removeFromFront();
			System.out.println(removedObj.toString() + " removed");
			objList.print();
			removedObj = objList.removeFromBack();
			System.out.println(removedObj.toString() + " removed");
			objList.print();
			removedObj = objList.removeFromBack();
			System.out.println(removedObj.toString() + " removed");
			objList.print();
		} catch (EmptyListException e) {
			System.err.println("\n" + e.toString());
		}
	}
}

class EmptyListException extends RuntimeException {

	private static final long serialVersionUID = 5130245130776457112L;

	public EmptyListException(String name) {
		super("The " + name + " is empty");
	}
}

// Class ListNode and class testList definitions
class ListNode {
	// package access data so class testList can access it directly
	Object data;
	ListNode next;

	// Constructor: Create a ListNode that refers to Object o.
	ListNode(Object o) {
		this(o, null);
	}

	// Constructor: Create a ListNode that refers to Object o and
	// to the next ListNode in the testList.
	ListNode(Object o, ListNode nextNode) {
		data = o; // this node refers to Object o
		next = nextNode; // set next to refer to next
	}

	// Return a reference to the Object in this node
	Object getObject() {
		return data;
	}

	// Return the next node
	ListNode getNext() {
		return next;
	}
}

// Class testList definition
class List {
	private ListNode firstNode;
	private ListNode lastNode;
	private String name; // String like "list" used in printing

	// Constructor: Construct an empty testList with s as the name
	public List(String s) {
		name = s;
		firstNode = lastNode = null;
	}

	// Constructor: Construct an empty testList with
	// "list" as the name
	public List() {
		this("list");
	}

	// Insert an Object at the front of the testList
	// If testList is empty, firstNode and lastNode will refer to
	// the same object. Otherwise, firstNode refers to new node.
	public synchronized void insertAtFront(Object insertItem) {
		if (isEmpty())
			firstNode = lastNode = new ListNode(insertItem);
		else
			firstNode = new ListNode(insertItem, firstNode);
	}

	// Insert an Object at the end of the testList
	// If testList is empty, firstNode and lastNode will refer to
	// the same Object. Otherwise, lastNode's next instance
	// variable refers to new node.
	public synchronized void insertAtBack(Object insertItem) {
		if (isEmpty())
			firstNode = lastNode = new ListNode(insertItem);
		else
			lastNode = lastNode.next = new ListNode(insertItem);
	}

	// Remove the first node from the testList.
	public synchronized Object removeFromFront() throws EmptyListException {
		Object removeItem = null;

		if (isEmpty())
			throw new EmptyListException(name);

		removeItem = firstNode.data; // retrieve the data

		// reset the firstNode and lastNode references
		if (firstNode.equals(lastNode))
			firstNode = lastNode = null;
		else
			firstNode = firstNode.next;

		return removeItem;
	}

	// Remove the last node from the testList.
	public synchronized Object removeFromBack() throws EmptyListException {
		Object removeItem = null;

		if (isEmpty())
			throw new EmptyListException(name);

		removeItem = lastNode.data; // retrieve the data

		// reset the firstNode and lastNode references
		if (firstNode.equals(lastNode))
			firstNode = lastNode = null;
		else {
			ListNode current = firstNode;

			while (current.next != lastNode)
				// not last node
				current = current.next; // move to next node

			lastNode = current;
			current.next = null;
		}

		return removeItem;
	}

	// Return true if the testList is empty
	public synchronized boolean isEmpty() {
		return firstNode == null;
	}

	// Output the testList contents
	public synchronized void print() {
		if (isEmpty()) {
			System.out.println("Empty " + name);
			return;
		}

		System.out.print("The " + name + " is: ");

		ListNode current = firstNode;

		while (current != null) {
			System.out.print(current.data.toString() + " ");
			current = current.next;
		}

		System.out.println("\n");
	}
	public ListNode getFirst() {
		return firstNode;
	}
}
