package C13_String;

import java.util.Arrays;

import Test.Static;
/**
 * String自带的正则表达式工具replace()
 * @author mgh2569702
 *
 */
public class P297_Replacing {
	static String s="Then, when you hava found the shrubbery," +
			"you must cut down the mightiest tree in the forest..." +
			"with...aherring!"; 
	public static void main(String[] args) {
		System.out.println(s.replace("h", "6"));
		System.out.println(s.replaceFirst("f\\w+", "located"));
		System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
		
		
	}

}