package C11_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class P235_map {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Big> bigs=new ArrayList<>();
		bigs.add(new Small());
		bigs.get(0).name();
	}

}

class Big{
	public void name() {
		System.out.println("big");
	}
}

class Small extends Big{
	
	@Override
	public void name() {
		System.out.println("small");
	}
}
