package Test;

public class TestBasic {
	public enum Gender{MALE,FEMALE};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("asasas \nsadasd");
		new CCC("ss");
		System.out.println(Gender.FEMALE.toString());
	}

}

class PPP{
	public PPP() {
		System.out.println("PPPPPPPPPPPPP");
	}
}
class  CCC extends PPP{
	public String name;
	public int age;
	
	public CCC(int age) {
		super();
		//this("xxx");
	}
	public CCC(String name) {
		this(20);
		this.name=name;
	}
	
	public CCC() {
		name="nnnn";
		return;
	}
}
