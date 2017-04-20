package Test;

import java.util.Arrays;


public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [][] fields={
			{1,2},
			{3,4},
			{5,6},
			{7,8},
		};
		
		System.out.println(fields.length);
		System.out.println(fields[1].length);
		System.out.println(Arrays.toString(fields[1]));
	}

}
