package C13_String;

import java.util.Arrays;

public class P296_pattern {

	/**
	 * @param args
	 * 正则表达式
	 */
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d+"));
	}

}


