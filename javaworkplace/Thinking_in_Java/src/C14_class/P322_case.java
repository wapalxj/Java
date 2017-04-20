package C14_class;

import sun.print.resources.serviceui;

import com.sun.org.apache.bcel.internal.generic.CASTORE;

public class P322_case {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<FancyToy> ftClass=FancyToy.class;
		FancyToy fancyToy=ftClass.newInstance();
		//编译错误
//		Class<Toy> upClass=ftClass.getSuperclass();
		Class<? super FancyToy> upClass2=ftClass.getSuperclass();
		
		ClassCast.cast();
	}

}
/**
 * 类型转换
 * @author mgh2569702
 *
 */
class Building{}
class House extends Building{}
class ClassCast{
	public static void cast() {
		Building b=new House();
		Class<House> houseType =House.class;
		House h=houseType.cast(b);//新的类型转换方式,将b转换成House对象
		House h2=(House) b;
		System.out.println(h==h2);
	}
}
