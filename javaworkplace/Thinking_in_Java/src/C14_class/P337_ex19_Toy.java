package C14_class;

import java.lang.reflect.Constructor;

public class P337_ex19_Toy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		E19_ReflectionToyCreation.main(args);
	}

}

class SuperToy extends FancyToy {
	int IQ;

	public SuperToy(int intelligence) {
		IQ = intelligence;
	}

	public String toString() {
		return "I'm a SuperToy. I'm smarter than you.";
	}
}

class E19_ReflectionToyCreation {
	public static Toy makeToy(String toyName, int IQ) {
		try {
			Class<?> tClass = Class.forName(toyName);
			for (Constructor<?> ctor : tClass.getConstructors()) {
				// Look for a constructor with a single parameter:
				Class<?>[] params = ctor.getParameterTypes();
				if (params.length == 1)
					if (params[0] == int.class)
						return (Toy) ctor.newInstance(
								new Object[] { Integer.valueOf(IQ) });
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public static void main(String args[]) {
		System.out.println(makeToy("C14_class.SuperToy", 150));
	}
}