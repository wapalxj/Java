package cc116_Generic;
/**
 * 泛型接口:与继承同理
 * @author Administrator
 *
 * @param <T>
 */
public interface Comparable<T> {
	void compare(T t);
}
//声明子类具体类型
class Comp4<T> implements Comparable<Integer>{
	public void compare(Integer t) {
		
	}
}

//都擦除
class Comp1 implements Comparable{
	public void compare(Object t) {
		
	}
}
//父类擦除，子类泛型
class Comp2<T> implements Comparable{
	public void compare(Object t) {
		
	}
}
//子类泛型》=父类泛型
class Comp3<T> implements Comparable<T>{
	public void compare(T t) {
		
	}
}
//父类泛型，子类擦除错误
//class Comp6 implements Comparable<T>{
//	
//}