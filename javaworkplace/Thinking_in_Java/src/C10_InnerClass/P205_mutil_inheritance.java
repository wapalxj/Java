package C10_InnerClass;

import java.awt.Rectangle;

public class P205_mutil_inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sequence s=new Sequence(5);
		
		for (int i = 0; i < s.length(); i++) {
			s.add(Integer.toString(i*10));
		}
		
		Selector selector=s.reverseSelector();
		while (!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}

}

class Sequence {
	private Object[] objects;
	private int next;
	private int length;
	public Sequence(int size) {
		objects = new Object[size];
		length=size;
	}

	public void add(Object x) {
		objects[next++] = x;
	}

	private class ReverseSelector implements Selector {
		private int i=length-1;

		@Override
		public void next() {
			if (i >= 0) {
				i--;
			}
		}

		@Override
		public Object current() {
			return objects[i];
		}

		@Override
		public boolean end() {
			return i < 0;
		}
	}

	private class SequenceSelector implements Selector {
		private int i;

		@Override
		public void next() {
			if (i < objects.length) {
				i++;
			}
		}

		@Override
		public Object current() {
			return objects[i];
		}

		@Override
		public boolean end() {
			return i == objects.length;
		}
	}
	
	public Selector reverseSelector() {
		return new ReverseSelector();
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public int length() {
		return length;
	}
}

interface Selector {
	void next();

	Object current();

	boolean end();
}
