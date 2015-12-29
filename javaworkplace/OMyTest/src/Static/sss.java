package Static;

public class sss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S2 s2=new S2();
		
	}

}

class S1{
	static{
		System.out.println("1111");
	}
}
class S2 extends S1{
	static{
		System.out.println("2222");
	}
}
