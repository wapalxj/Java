package cc122_sort;

import java.util.Comparator;

public class ComparatorString {
	
}

class  StringComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int len1 =o1.length();
		int len2 =o2.length();
		return len1-len2;
	}
	
}

class StringComparable implements Comparable<String>{

	@Override
	public int compareTo(String o) {
		return 0;
	}
}