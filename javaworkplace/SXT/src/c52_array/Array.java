package c52_array;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a;
		int b[];
		a=new int[5];
		b=new int[5];
	
		
		Car []cars= {new Car("奔驰"),
					 new Car("宝马"),
					 new Car("比亚迪"),
					 new Car("大众"),};

		//自动初始化为0
		int []c =new int[10];
		for (int i=0;i<c.length;i++){
			System.out.print(c[i]+"--");
		}

		
	}

}
