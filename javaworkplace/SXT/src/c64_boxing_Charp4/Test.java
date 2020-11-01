package c64_boxing_Charp4;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer a =new Integer(10);
		Integer a =10;//after jkd5.0:自动装箱，编译器帮助改进代码：Integer a =new Integer(10);
		
		Integer b =1000;
		
		
		int c=new Integer(1500);//自动拆箱：编译器会改进:Integer(1500).intValue().
		int d=b;//自动拆箱：编译器会改进:d=b.intValue()
		
		
		
		System.out.println(d);
		
		Integer q1 =1000;//自动装箱成Integer对象，
		Integer q2 =1000;//自动装箱Integer，
		
		System.out.println(q1==q2);
		System.out.println(q1.equals(q2));
		System.out.println("########################");
		
		Integer d3 =123;//[-128,127]之间的数，虽然自动装箱了，但仍然被当做基本数据类型处理
		Integer d4 =123;
		
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));

		System.out.println(Integer.TYPE);
	}

}
