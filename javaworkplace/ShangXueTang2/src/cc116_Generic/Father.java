package cc116_Generic;
/**
 * 父类为泛型类
 * 1.属性
 * 2.方法
 * 方法：要么同时擦除，要么子类的泛型大于等于父类（数量：T1,T2,T3）
 * 不能子类擦除，父类泛型
 * 属性:
 * 父类中，随父类而定
 * 子类中，随子类而定
 * 
 * 方法重写：随父类而定
 * @author Administrator
 *
 * @param <T>
 */
public abstract class Father<T> {
	T name;
	
	public abstract void test(T t);
		
	
}
/**
 * 子类声明时指定具体类型
 * 属性类型为具体类型
 * @author Administrator
 *
 */
class Child1 extends Father<String>{
	String t1;
	
	public void test(String t) {//方法重写，随父类而定，父类String
		
	}
}
/**
 * 子类为泛型类，类型在使用时确定
 * @author Administrator
 *
 * @param <T1>
 */
class Child2<T> extends Father<T>{
	T t2;
	public void test(T t) {//方法重写，随父类而定，父类T
		
	}
}
/*
 * 子类为泛型类，父类不指定类型：泛型的擦除，擦除的泛型使用Object替换
 */

class Child3<T,T2,T4> extends Father{
	T t2;
	public void test(Object t) {//方法重写，随父类而定，父类擦除则为Object
		
	}
}

/*
 * 子类与父类同时擦除
 */

class Child4 extends Father{
	String name;
	public void test(Object t) {
		
	}
}

/*
 * 错误：子类擦除，父类使用泛型（子类少于父类泛型）
 */
//
//class Child5 extends Father<T>{
//	
//	public void test(Object t) {
//		
//	}
//}