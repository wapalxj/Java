package c43_final;

import java.util.Random;

public class TestFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int MAX_VAlLUE=200;

		Random random=new Random();
		final int a=random.nextInt(100);
		final int b=random.nextInt(100);
		System.out.println(a);
		System.out.println(b);
	}

}
