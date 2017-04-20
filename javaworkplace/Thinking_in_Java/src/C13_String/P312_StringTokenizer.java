package C13_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P312_StringTokenizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input="But I'm not dead yet ! I feel happy";
		StringTokenizer stoke=new StringTokenizer(input);
		
		while (stoke.hasMoreElements()) {
			System.out.print(stoke.nextToken()+"---");
		}
		System.out.println();
		//¶Ô±ÈScanner
		Scanner scanner=new Scanner(input);
		while (scanner.hasNext()) {
			System.out.print(scanner.next()+"...");
		}
		
	}

}
