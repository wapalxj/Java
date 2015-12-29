package cc118_Ge2_poly;

public class GeATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//错误，不能形成多态
		//GeA<Fruit> f=new GeA<Apple>();
		
		GeA<Fruit> f2=new GeA<Fruit>();	
		
		test(new GeA<Fruit>());
		//test(new GeA<Apple>());//错误，不能形成多态
	}
	
	//形参使用多态
	public static void test(GeA<Fruit> f) {
		
	}
	//返回使用多态
	public static GeA<Fruit> test2() {
		//错误，不能形成多态
		//return (GeA<Apple>)(new GeA<Apple>());
		return null;
	}

}
