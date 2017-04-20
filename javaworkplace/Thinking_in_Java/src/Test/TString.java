package Test;

import java.util.HashMap;
import java.util.Map;

public class TString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String str="     ";
//		System.out.println(str==null);
//		System.out.println(str.equals(""));
//		System.out.println(str.trim().equals(""));
		
		Map<Integer, Integer> map=new HashMap<>();
		map.put(11, 1111);
		map.put(10, 1111);
		map.put(12, 1111);
		
		
		System.out.println(map);
		
		
	}

}
