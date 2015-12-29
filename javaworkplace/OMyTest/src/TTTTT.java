import java.lang.reflect.Array;
import java.util.Arrays;


public class TTTTT {
	
	public int a=1;
	public static void main(String[] args) {
		int i=1;
		for (int j = 0; j < 5; j++) {
			i+=i;
			System.out.println(i);
		}
	}

	public int getA(){
		return this.a;
	}
}

class tt extends TTTTT{
	public tt(){
		super();
		this.a=100;
	}
	public int getA(){
		return this.a;
	}
}
