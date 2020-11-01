package C11_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P221_AsListInterface {

	/**
	 * @param args
	 * ����û�б���ʱ��̬
	 */
	public static void main(String[] args) {
		List<Snow> snow1=Arrays.asList(new Crusty(),new Slush(),new Powder());
		
		//testList<Snow> snow2=Arrays.asList(new Light(),new Heavy());
		List<Snow> snow3=new ArrayList<>();
		Collections.addAll(snow3, new Light(),new Heavy());
		
		List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
		
		List<Snow> snow5=new ArrayList<>();
		snow5.add(new Powder());
		
		snow5.get(0).say();
	}

}

class Snow{
	public void say() {
		System.out.println("Snow---say()");
	}
}
class Powder extends Snow{
	@Override
	public void say() {
		System.out.println("Power---say()");
	}
}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
