package c99_Collection;

import java.util.HashMap;
import java.util.Map;

import org.xml.sax.HandlerBase;

public class TestMap {

	/**
	 * map:ͨ������ֵ
	 * @param args
	 */
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("vnix",new Wife("vero"));
		m.put("vnix2",new Wife("vero2"));
		
		System.out.println(m.containsKey("vnix"));
		
		Wife w=(Wife)m.get("vnix");
		m.remove("vnix");//����-ֵ�������Ƴ�
	

		System.out.println(w.name);
		
	}

}

class Wife{
	String name;

	public Wife(String name) {
		super();
		this.name = name;
	}
	
}
