package c72_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class Test2throws {

	/**
	 * 异常的测试：2.抛出异常throws
	 * 异常声明的范围
	 * @param args
	 */
	public static void main(String[] args) {
		// 注：也可以将main方法声明异常，这样是将异常抛给JRE
		String str = null;
		try {
			str=new Test2throws().openFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(str);
	}
	//声明throws2个异常，谁调用此声明异常的方法，谁就对应捕获2个异常(JXL说只需要catch其中任何一个)
	String openFile() throws FileNotFoundException,IOException{
		FileReader reader=new FileReader("d:/a.txt");
		char c=(char)reader.read();
		System.out.println(c);
		return ""+c;
	}

}

class A{
	public void method()throws IOException {		
	}
}

//子类throws子句抛出的异常，不能是基类同名方法抛出异常的父类
class B extends A{
	public void method()throws FileNotFoundException {		
	}
}
class C extends A{
	public void method() {		
	}
}
class D extends A{
	//public void method()throws Exception {		
	//}
}
class E extends A{
	public void method()throws IOException,FileNotFoundException {		
	}
}
class F extends A{
	public void method()throws IOException,ArithmeticException{		
	}
}
class G extends A{
//	public void method()throws IOException,ParseException{		
//	}
}