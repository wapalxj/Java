package c72_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class Test2throws {

	/**
	 * �쳣�Ĳ��ԣ�2.�׳��쳣throws
	 * �쳣�����ķ�Χ
	 * @param args
	 */
	public static void main(String[] args) {
		// ע��Ҳ���Խ�main���������쳣�������ǽ��쳣�׸�JRE
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
	//����throws2���쳣��˭���ô������쳣�ķ�����˭�Ͷ�Ӧ����2���쳣(JXL˵ֻ��Ҫcatch�����κ�һ��)
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

//����throws�Ӿ��׳����쳣�������ǻ���ͬ�������׳��쳣�ĸ���
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