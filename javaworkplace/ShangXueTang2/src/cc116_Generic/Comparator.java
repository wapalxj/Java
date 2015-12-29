package cc116_Generic;
/**
 * 接口中泛型字母只能使用在方法中，不能使用在全局常量
 * @author Administrator
 *
 * @param <T>
 */
public interface Comparator <T>{
//	T a=2;//error
	void compare(T t);
}
