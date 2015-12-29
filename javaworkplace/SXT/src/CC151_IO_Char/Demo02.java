package CC151_IO_Char;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import jdk.jfr.events.FileWriteEvent;

/**
 * 写出文件
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		// 创建源
		File dest =new File("E:/others/char.txt");
		//选择流
		Writer wr=null;
		try {
			wr=new FileWriter(dest);//如果追加内容则FileWriter(dest,true)
			//写出
			String msg="JAVA\r\n数字媒体技术\r\nHTML5";
			wr.write(msg);
			wr.append("追加一个结尾");
			wr.flush();
		} catch (FileNotFoundException e) {
			System.out.println("源文件不存在！");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("写出失败！");
			e.printStackTrace();
		}finally{
			try {
				wr.close();
			} catch (IOException e) {
				System.out.println("关闭失败！");
				e.printStackTrace();
			}
		}

	}

}
