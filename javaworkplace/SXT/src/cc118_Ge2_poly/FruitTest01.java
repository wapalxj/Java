package cc118_Ge2_poly;
/**
 * 一般多态的两种形式，
 * @author Administrator
 *
 */
public class FruitTest01{
	public static void main(String[] args) {
		Fruit f=new Fruit(); 
		test(new Apple());//形参使用多态
	}
	
	//形参使用多态
	public static void test(Fruit f) {
		
	}
	//返回使用多态
	public static Fruit test2() {
		return new Apple();
	}


}
