
public class Test1 {

	public static void main(String[] args) {
		int A = Integer.parseInt(args[0]);
		int B = Integer.parseInt(args[1]);
		int C = Integer.parseInt(args[2]);
		boolean ordered;
		ordered = (A < B && B < C || A > B && B > C);
		System.out.println(ordered);
	}

}
