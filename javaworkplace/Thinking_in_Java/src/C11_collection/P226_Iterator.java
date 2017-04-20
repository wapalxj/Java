package C11_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P226_Iterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> strings =new ArrayList<>();
		
		Iterator<String> it=strings.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
	}

}
