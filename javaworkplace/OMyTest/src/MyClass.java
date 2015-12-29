import java.util.ArrayList;
import java.util.List;


public class MyClass {
	public static void main(String[] args) {
		List l =new ArrayList();
		l.add("aaaa");
		l.add("aaaa");
		l.add(1);
		
	
		String s=(String)l.get(2);
		System.out.println(s.length());
		
		
	}
}
