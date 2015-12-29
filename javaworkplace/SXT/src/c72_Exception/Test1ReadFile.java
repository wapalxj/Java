package c72_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1ReadFile {

	/**
	 * 异常测试：
	 * 执行顺序：
	 * 1.执行try,catch,给返回值赋值（但不返回）
	 * 2.执行finally
	 * 3.return(return只能一个值，后执行的return会覆盖先执行的
	 * 于是finally中return "fff"会覆盖前面的return）
	 * 所以finally中一般不加return
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =new Test1ReadFile().openFile();
		System.out.println(str);
	}
	
	String openFile(){
		try {
			System.out.println("aaa");
			FileInputStream fis=new FileInputStream("d:/a.txt");//将打开的文件换成错误的，则会抛出异常
			int a=fis.read();
			System.out.println("bbb");
			return "step1";
		} catch (FileNotFoundException e) {
			System.out.println("catching!!!!!");
//			e.printStackTrace();
			return "step2";
		}catch (IOException e) {
//			e.printStackTrace();
			return "step3";
		}finally{
			System.out.println("finally!!!");
			//return "fff";
		}
	}

}
