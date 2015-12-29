package CC151_IO_Char;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 纯文本读取
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		// 创建 源
		String src ="E:/others/char.txt";
		//选择流
		Reader reader =null;
		try {
			reader=new FileReader(src);
			//读取
			char [] flush =new char[10];
			int len=0;
			while (-1!=(len=reader.read(flush))) {
				String str=new String(flush,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("源文件不存在！");
		} catch (IOException e) {
			System.out.println("读取失败！");
			e.printStackTrace();
		}finally{
			if (null!=reader) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("关闭失败！");
					e.printStackTrace();
				}
			}
		}
		

	}

}
