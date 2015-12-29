package c99_Collection;

import c37.This;

/**
 * ����
 * @author Administrator
 *
 */
public class MyLinkedList {
	private Node first;
	private Node last;
	private int size;
	
	public MyLinkedList() {
	
	}
	
	public void add(Object obj) {
		Node n=new Node();
		if (this.first==null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			this.first =n;
			this.last=n;
		}else {
			n.setPrevious(this.last);
			n.setObj(obj);
			n.setNext(null);
			last.setNext(n);
			
			this.last=n;
		}
		this.size++;
	}
	
	public int size() {
		return this.size;
	}
	
	public Object get(int index) {
		RangeCheck(index);
		
		Node temp =Node(index);
		if (temp!=null) {
			return temp.obj;
		}
		return null;
	}
	
	public Node Node(int index) {
		Node temp =null;
		if (first!=null) {
			temp=first;
			for (int i = 0; i < index; i++) {
				temp=temp.next;
			}	
		}
		return temp;
		/**
		 * JDKԴ�룺
		 * if(index<(size>>1)){//������λ���൱�ڳ���2����˼���ǣ���indexС��size/2��ʱ�򣬴�ͷ��ʼ�����������β��ʼ����
		 * 	  Node temp =first;
			  for (int i = 0; i < index; i++) {
				temp=temp.next;		
			  }	
			 return temp;
		    }else{
				Node temp =last;
				  for (int i = size-1; i > index; i--) {
					temp=temp.previous;		
				  }	
				 return temp;
		}
		 * 
		 * 
		
		 */
		
	}
	
	public void remove(int index) {
		RangeCheck(index);
		Node temp =Node(index);
		if (temp!=null) {
			Node former=temp.previous;
			Node down =temp.next;
			former.next=down;
			down.previous=former;
			
			size--;
		}
		
		
	}
	
	public void add(int index,Object obj) {
		RangeCheck(index);
		Node temp= Node(index);
		Node newNode=new Node();
		newNode.obj=obj;
		
		if (temp!=null) {
			Node former =temp.previous;
			
			former.next=newNode;
			newNode.previous=former;
			
			newNode.next=temp;
			temp.previous=newNode;
			
			size++;
		}
	}
	
	private void RangeCheck(int index) {
		if (index<0||index>=this.size) {
			try {
				throw new Exception("Խ����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList list =new MyLinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("cccc");
		list.add(1,"bbbbbb");
	
//		list.remove(1);
		System.out.println(list.get(1));
	}
}
