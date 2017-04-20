package C11_collection;

import java.util.ArrayList;
import java.util.List;

public class Test_Basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> strings=new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			strings.add(i+"i");
		}
		System.out.print(strings);
	}

}
