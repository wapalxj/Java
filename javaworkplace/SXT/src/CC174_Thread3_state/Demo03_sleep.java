package CC174_Thread3_state;

public class Demo03_sleep {

	public static void main(String[] args) throws InterruptedException {
		int num=10;
		while (true) {
			System.out.println(num--);
			Thread.sleep(1000);
			if (num<=0) {
				break;
			}
		}

	}

}
