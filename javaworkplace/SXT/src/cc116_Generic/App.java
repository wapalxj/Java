package cc116_Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类型转换
 * @author Administrator
 *
 */
public class App<T>{
	public  <T> List<T> say(){
		return new ArrayList<T>();
	}
	public static void main(String[] args) {
		Object obj =80; //自动装箱
		System.out.println(obj.getClass());//自动装箱
		//JDK1.7以以后可以直接这么转
//		int score =(int)obj;
//		System.out.println(score);
		
		//JDK1.7.以前要这么转
//		int v = Integer.parseInt(String.valueOf(obj));
//		System.out.println(v);
//		或者
//		int v=(Integer) obj;
//		System.out.println(v);
		
		// 存入整数int--->Integer--->Object
		Student stu =new Student(80,90);
		int javaseScore =(Integer)stu.getJavase();
		
		String oralcleScore=null;
		oralcleScore =stu.getOracle().toString();
		
//		if (stu.getOracle() instanceof String) {//尚学堂培新写错了？？？？
//			oralcleScore =(String)stu.getOracle();
//		}
	
		System.out.println(javaseScore+" "+oralcleScore);
	}

}
