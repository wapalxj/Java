package CC151_IO_Char;
/**
 * 纯文本的拷贝
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class copyFileDemo {

	public static void main(String[] args) {
		// 创建源
		String src ="F:/others/char.txt";
		File dest =new File("F:/others/char20.txt");
		//选择流
		Reader reader =null;
		Writer wr=null;	
		try {
			reader=new FileReader(src);
			wr=new FileWriter(dest);//如果追加内容则FileWriter(dest,true)
			//读取
			char [] flush =new char[10];
			int len=0;
			while (-1!=(len=reader.read(flush))) {
				wr.write(flush,0,len);
			}
			wr.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("源文件不存在！");
		} catch (IOException e) {
			System.out.println("读取失败！");
			e.printStackTrace();
		}finally{//先打开的后关闭
			try {
				if (null!=wr) {
					wr.close();
				}
			} catch (IOException e) {
				System.out.println("关闭失败！");
				e.printStackTrace();
			}
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
