package cc118_Ge3;
/*
 * 没有泛型数组
 */
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr =new Integer[4];
		//声明可以，但是创建失败
//		Student<String>[] arr2 =new Student<String>[4];
		Student<?> [] arr2 =new Student[5];
		
		MyArrayList<String> strList =new MyArrayList<String>();
		strList.add(0, "a");
		String elem=strList.getEle(0);
		System.out.println(elem);
	}

}
class Student<T>{
	
}
class MyArrayList<E>{
	//不能写成E[] c=new Object[10];//没有泛型数组
	Object[] c =new Object[10];
	
	public void add(int idx,E e) {
		c[idx]=e;
	}
	public E[] getAll(){
		return (E[])c;
	}
	public E getEle(int idx){
		return (E)c[idx];
	}
}