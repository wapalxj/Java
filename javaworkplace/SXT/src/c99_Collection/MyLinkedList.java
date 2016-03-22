package c99_Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

import c37.This;

/**
 * 链表
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
		Node node=new Node();
		if (this.first==null) {
			node.setPrevious(null);
			node.setObj(obj);
			node.setNext(null);
			
			this.first =node;
			this.last=node;
		}else {
			node.setPrevious(this.last);
			node.setObj(obj);
			node.setNext(null);
			last.setNext(node);
			
			this.last=node;
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
		 * JDK源码：
		 * if(index<(size>>1)){//向右移位，相当于除以2，意思就是：当index小于size/2的时候，从头开始遍历，否则从尾开始遍历
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
				throw new Exception("越界了");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		List l=new LinkedList();
		MyLinkedList list =new MyLinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("cccc");
		list.add(1,"bbbbbb");
	
//		list.remove(1);
		System.out.println(list.get(1));
	}
}

