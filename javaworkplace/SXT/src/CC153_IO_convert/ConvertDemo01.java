package CC153_IO_convert;

import java.io.UnsupportedEncodingException;

public class ConvertDemo01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		test1();
		String str="中国";
		byte[] data=str.getBytes();
		//乱码2：字节数不完整
		System.out.println("字节数不完整的中国："+new String(data,0,3));
		
	}
	/*
	 * 乱码1.编码与解码字符集必须相同，否则乱码
	 */
	public static void test1()  throws UnsupportedEncodingException{
		//解码byte-->char
		String str="中国";
		//编码char-->byte
		byte[] data=str.getBytes();
		System.out.println("默认的平台编码与解码中国："+new String(data));
		
		//设定编码字符集
		data =str.getBytes("utf-8");
		//编码解码字符集不统一则出现乱码
		System.out.println("utf-8编码的中国，默认解码的中国： "+new String(data));
		
		System.out.println("****UTF-8******");
		//编码
		byte[] data2="中国".getBytes("utf-8");
		//解码
		str=new String(data2,"utf-8");
//				str=new String(data2);//不制定解码格式就是乱的
		System.out.println("按utf-8编码和解码的中国： "+new String(str));
		
	}
}
