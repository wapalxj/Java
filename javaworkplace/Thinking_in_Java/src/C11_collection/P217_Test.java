package C11_collection;

import java.util.ArrayList;

public class P217_Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList a = new ArrayList();

		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList<String> strings = new ArrayList();
		strings.add("s1111");
		System.out.println(strings.get(0));

		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		apples.add(new Orange());

		for (int i = 0; i < apples.size(); i++) {
			long aId = ((Apple) apples.get(i)).id();
			System.out.println(aId);
		}

	}

}

class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}

class Orange {
}