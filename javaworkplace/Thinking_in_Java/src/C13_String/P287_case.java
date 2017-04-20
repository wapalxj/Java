package C13_String;

import java.util.ArrayList;
import java.util.List;

public class P287_case {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<InfiniteRecursion> ins=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ins.add(new InfiniteRecursion());
		}
		System.out.println(ins);
	}
}

class InfiniteRecursion{
	@Override
	public String toString() {
		return "InfiniteRecursion addr: "+this+"\n";
	}
}