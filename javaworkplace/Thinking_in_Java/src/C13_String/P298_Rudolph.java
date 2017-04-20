package C13_String;

public class P298_Rudolph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (String pattern : new String[]{
				"Rudolph","[rR][aeiou][a-z]o.*",
				"R.*"
		}) {
			System.out.println("Rudolph".matches(pattern));
		}
	}

}
