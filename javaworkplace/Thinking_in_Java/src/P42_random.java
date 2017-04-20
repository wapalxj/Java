import java.util.Random;


public class P42_random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random=new Random(100);
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));

	}

}
