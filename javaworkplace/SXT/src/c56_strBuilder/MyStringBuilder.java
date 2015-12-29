package c56_strBuilder;
/**
 * 自己写的简易的StringBuilder 
 */
import java.util.Arrays;

import sun.nio.cs.ext.ISCII91;

public class MyStringBuilder {
	char[] value;
	int count;
	
	public MyStringBuilder() {
		this(16);
	}

	public MyStringBuilder(int capacity) {
		super();
		value =new char[capacity];
	}
	
	public int length() {
        return count;
    }
	
	public int capacity() {
        return value.length;
    }
	
	public MyStringBuilder(String str) {
        this(str.length() + 16);
        append(str);
    }
	
	 public MyStringBuilder append(String str) {
		 if (str == null)
	            return this;
	        int len = str.length();
	        ensureCapacityInternal(count + len);//保证容量是足够的
	        str.getChars(0, len, value, count);//字符的复制函数
	        count += len;
	        return this;
	    }
	 
	 private void ensureCapacityInternal(int minimumCapacity) {
	        // overflow-conscious code
	        if (minimumCapacity - value.length > 0)
	            expandCapacity(minimumCapacity);
	    }
	 
	 void expandCapacity(int minimumCapacity) {
	        int newCapacity = value.length * 2 + 2;
	        if (newCapacity - minimumCapacity < 0)
	            newCapacity = minimumCapacity;
	        if (newCapacity < 0) {
	            if (minimumCapacity < 0) // overflow
	                throw new OutOfMemoryError();
	            newCapacity = Integer.MAX_VALUE;
	        }
	        value = Arrays.copyOf(value, newCapacity);
	    }
	 
	 public MyStringBuilder append(StringBuffer sb) {
	        if (sb == null)
	            return this;
	        int len = sb.length();
	        ensureCapacityInternal(count + len);
	        sb.getChars(0, len, value, count);
	        count += len;
	        return this;
	    }
	 public MyStringBuilder append(char[] str) {
	        int len = str.length;
	        ensureCapacityInternal(count + len);
	        System.arraycopy(str, 0, value, count, len);
	        count += len;
	        return this;
	    }
	 
	 public String toString() {
	        // Create a copy, don't share the array
	        return new String(value, 0, count);
	    }
}
