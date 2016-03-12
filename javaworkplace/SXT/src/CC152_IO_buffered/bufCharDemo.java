package CC152_IO_buffered;
/*
 *字符缓冲流+新增方法（不能发生多态）
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class bufCharDemo {

	public static void main(String[] args) {
		// 创建源
		String src ="E:/others/char.txt";
		File dest =new File("E:/others/char3.txt");
		//选择流
		//使用新增方法不能发生多台所以此行不能写成：Reader reader =null;Writer wr=null;
		BufferedReader reader =null;
		BufferedWriter wr=null;	
		try {
			reader=new BufferedReader(new FileReader(src));
			wr=new BufferedWriter(new FileWriter(dest));//如果追加内容则FileWriter(dest,true)
			//读取
//			
//			char [] flush =new char[1024];
//			int len=0;
//			while (-1!=(len=reader.read(flush))) {
//				wr.write(flush,0,len);
//			}
			//按行读取:新增的方法
			String line =null;
			while (null!=(line=reader.readLine())) {
				wr.write(line);
				wr.newLine();//换行
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
