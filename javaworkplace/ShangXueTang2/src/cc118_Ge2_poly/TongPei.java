package cc118_Ge2_poly;
/**
 * 通配符？的使用：
 * 只能用于声明类型和方法上，不能声明类或使用时
 * 
 * ?extends 表示：<=上限
 * ？super 表示：>=下限
 * @author Administrator
 *
 * @param <T>
 */
//public class TongPei<?>//错误
public class TongPei<T> {
	T score;
	
	
	
	
	public static void main(String[] args) {
		TongPei<?> t = new TongPei<String>();
		test(new TongPei<Integer>());
		test2(new TongPei<Apple>());//<=
		//test3(new TongPei<Apple>());//泛型没有多态
		
		
		//test4(new TongPei<Integer>());//<=
		//test4(new TongPei<Apple>());//<=
		test4(new TongPei<Fruit>());//自身
		test4(new TongPei<Object>());//>=
		//test4(t);//使用时应该确定类型
	}
	public static void test(TongPei<?> t) {//将?改为T则错误
		
	}
	//<=
	public static void test2(TongPei<? extends Fruit> t ) {
		
	}
	
	public static void test3(TongPei<Fruit> t ) {
		
	}
	//>=
	public static void test4(TongPei<?super Fruit> t ) {
		
	}
}
