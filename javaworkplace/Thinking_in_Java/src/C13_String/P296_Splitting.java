package C13_String;

import java.util.Arrays;
/**
 * String 自带的正则表达式工具split()
 * @author mgh2569702
 *
 */
public class P296_Splitting {

	public static String knights="Then, when you hava found the shrubbery," +
			"you must cut down the mightiest tree in the forest..." +
			"with...aherring!";
	
	public static void split(String regex){
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	
	public static void main(String[] args) {
		split(" ");
		split("\\W+");
		split("n\\W+");
	}

}
