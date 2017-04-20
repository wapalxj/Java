package C13_String;

import java.math.BigInteger;
import java.util.Formatter;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import org.apache.commons.lang3.Conversion;

public class P292_formatter_Conversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Formatter formatter=new Formatter(System.out);
		char c='a';

		formatter.format("'c'--%%s:%s\n", c);
		//formatter.format("%d", c);
		formatter.format("'c'--%%c:%c\n", c);
		formatter.format("'c'--%%b:%b\n", c);
		//formatter.format("%f", c);
		//formatter.format("%e", c);
		
		int i=250;

		formatter.format("250--%%d:%d\n", i);
		formatter.format("250--%%c:%c\n", i);
		formatter.format("250--%%b:%b\n", i);
		formatter.format("250--%%s:%s\n", i);
//		formatter.format("%f", i);
//		formatter.format("%e", i);
		formatter.format("250--%%x:%x\n", i);
		formatter.format("250--%%h(hash):%h\n", i);

		BigInteger w =new BigInteger("50000000000000");
		System.out.println("w=new BigInteger(\"50000000000000\")");
		formatter.format("w--%%d:%d\n",w);
//		formatter.format("%c\n",w);
		formatter.format("w--%%b:%b\n",w);
		formatter.format("w--%%s:%s\n",w);
//		formatter.format("w--%%f:%f\n",w);
//		formatter.format("w--%%e:%e\n",w);
		formatter.format("w--%%x:%x\n",w);
		formatter.format("w--%%h:%h\n",w);
		
		double x=179.543;
		System.out.println("x=179.543");
//		formatter.format("x--%%d:%d\n",x);
//		formatter.format("x--%%c:%c\n",x);
		formatter.format("x--%%b:%b\n",x);
		formatter.format("x--%%s:%s\n",x);
		formatter.format("x--%%f:%f\n",x);
		formatter.format("x--%%e:%e\n",x);
//		formatter.format("x--%%x:%x\n",x);
		formatter.format("x--%%h:%h\n",x);
		
		Conversion y=new Conversion();
		System.out.println("y=new Conversion()");
//		formatter.format("y--%%d:%d\n",y);
//		formatter.format("y--%%c:%c\n",y);
		formatter.format("y--%%b:%b\n",y);
		formatter.format("y--%%s:%s\n",y);
//		formatter.format("y--%%f:%f\n",y);
//		formatter.format("y--%%e:%e\n",y);
//		formatter.format("y--%%x:%x\n",y);
		formatter.format("y--%%h:%h\n",y);
		
		boolean z=false;
		System.out.println("z=false");
//		formatter.format("z--%%d:%d\n",z);
//		formatter.format("z--%%c:%c\n",z);
		formatter.format("z--%%b:%b\n",z);
		formatter.format("z--%%s:%s\n",z);
//		formatter.format("z--%%f:%f\n",z);
//		formatter.format("z--%%e:%e\n",z);
//		formatter.format("z--%%x:%x\n",z);
		formatter.format("z--%%h:%h\n",z);
		
		
		//对于非boolean类型，只要不为null,转换为boolean均为true
		formatter.format("null-->%%b:%b\n",null);
		formatter.format("0-->%%b:%b\n",0);
		formatter.format("\"\"-->%%b:%b\n","");
	}

}
