package C13_String;

import java.util.Arrays;

public class P297_ex8_split {

	/**
	 * @param args
	 * 将这个字符串在the和you处分离
	 */
	public static void main(String[] args) {
		String s="Then, when you hava found the shrubbery," +
				"you must cut down the mightiest tree in the forest..." +
				"with...aherring!"; 
		System.out.println(Arrays.toString(s.split("you|the")));
	}

}
