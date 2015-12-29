package cc116_Generic;

import java.io.Closeable;
import java.io.IOException;

/**
 * 泛型方法:
 * 修饰符<>返回类型
 * 只能访问对象的信息，不能修改，因为操作时候将"a"传给(t a)的时候类型其实没有确定
 * @author Administrator
 *
 */
public class TestMethod<T> {
	
	public static void main(String[] args) {
		test("a");

	}

	public static <T> void test(T a) {//静态方法中前面的T表示方法参数中T的声明可以用到类型，如果不对T进行限定，则默认可以使用所有的对象，非静态方法可以指明也可以不指明
//		a.set();//无法调用a的方法。只能访问对象的信息，不能修改
		System.out.println(a);
	}
	public static <T extends Closeable> void test(T... a) {//表示T只能是Closeable接口的实现类，T...表示可变参数
		for (T temp:a) {
			try {
				if(null!=temp){
					temp.close();	
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		System.out.println(a);
	}

}
