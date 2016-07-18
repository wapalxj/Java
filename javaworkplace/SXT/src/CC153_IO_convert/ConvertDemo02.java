package CC153_IO_convert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * 转换流：字节转字符
 * 1.输出流：OutputStreamWriter:编码
 * 2.输出流：InputStreamReader：解码
 */
public class ConvertDemo02 {

	public static void main(String[] args) throws IOException {
		//内部使用字节流InputStreamReader指定解码字符集（源文件已经被存为UTF-8）
		BufferedReader br=new BufferedReader(
				new InputStreamReader(//此处就为转换流
				//按GBK读取		
//				new FileInputStream(new File("E:/others/char.txt")),"GBK")
				//按UTF-8读取
						new FileInputStream(new File("E:/others/char.txt")),"UTF-8")
		);
		//写出
//		BufferedWriter bw=new BufferedWriter(new FileWriter("E:/others/char4.txt"));
		BufferedWriter bw=new BufferedWriter(
				new OutputStreamWriter(
						
						new FileOutputStream(new File("E:/others/char4.txt")),"GBK")
				
				
		);
		String info=null;
		while (null!=(info=br.readLine())) {
			System.out.println(info);
			bw.write(info,0,info.length());
			bw.newLine();//换行
		}

		bw.flush();
		bw.close();
		br.close();
		
	}

}
