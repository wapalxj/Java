package c99_Collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set s =new HashSet();
		s.add("aaa");
		s.add("bbbb");
		s.add(new String("aaa"));//�ظ����ж�������equals
		System.out.println(s.size());
		
	}

}
