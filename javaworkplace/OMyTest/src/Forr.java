
public class Forr {

	public static void main(String[] args) {
		int c=3;
		if (c<0) 
			if(c>3)c=2;
			else c=4;
			else c=5;
		System.out.println("c:"+c);
		int i=1;
		for (int j = 0; j < 5; j++) {
			i=i++;
			System.out.println(i);
		}
		System.out.println(i);
	}

}
