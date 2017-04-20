package C10_InnerClass;

public class P196_args {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=10;
		String s="ss";
		Vnix x=new Vnix(i){
			public void name() {
				//System.out.print(i);
				//System.out.print(s);
			}
		};
	}

}

class Vnix{
	public Vnix(int i){
		
	}
}