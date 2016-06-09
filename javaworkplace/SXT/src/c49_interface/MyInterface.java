package c49_interface;

public  interface MyInterface {
	//接口中定义的常量，写不写public static final,都存在

	public static final String MAX_GREAD="BOSS";
	int MAX_SPEED=120;

	//接口中定义的方法，写不写public,都存在
	public void test01();
	public int test02(int a,int b);		
}