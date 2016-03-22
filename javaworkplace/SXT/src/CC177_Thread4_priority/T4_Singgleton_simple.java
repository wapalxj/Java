package CC177_Thread4_priority;

/*
 * 单例设计模式:单线程的
 * 1.构造器私有化
 * 2.声明一个私有静态变量
 * 3.提供对外的公共静态方法
 */
public class T4_Singgleton_simple {

	public static void main(String[] args) {
		Jvm j1=Jvm.single();
		Jvm j2=Jvm.single();
		System.out.println(j1==j2);
	}

}
class Jvm{
	private static Jvm instance=null;
	
	private Jvm(){
		
	}
	public static Jvm single(){
		if (instance==null) {
			instance=new Jvm();
		}
		return instance;
	}
}