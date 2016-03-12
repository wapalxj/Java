package CC146_IO_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import jdk.internal.org.xml.sax.InputSource;

/*一、读取文件
 * 1、建立联系 ：File对象
2、选择流  ：  文件输入流 InputStream FilenputStream
3、操作   数组大小+read\write
4、释放资源：关闭

 */
public class Demo01 {

	public static void main(String[] args) {
		//1、建立联系 ：File对象:源头
		File src =new File("F:/others/xp.txt");
		//2、选择流:文件输入流 
		InputStream is=null;
		try {
			is =new FileInputStream(src);
			//3、操作 :不断读取:每次读10个字节：缓冲数组
			byte[] car =new byte[10];
			int len=0;//接收实际读取大小
			//循环读取
			try {
				while (-1!=(len=is.read(car))) {
					//输出：将字节数组转化为字符串
//					System.err.println("car: "+car.toString());
					String info=new String(car,0,len);
					System.err.println(info);
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("文件不存在");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("读取文件失败");
		}finally{
			//4.释放
			if (null!=is) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("关闭文件输入流失败");
				}
				
			}
		}
	}

}
