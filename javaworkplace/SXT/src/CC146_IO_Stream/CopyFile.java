package CC146_IO_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 1、建立联系 ：File对象 ：源头+目的地
2、选择流  ：  文件输出流 InputStream FileInputStream
				     文件输出流  OutputStream FileOutputStream
3、操作：   拷贝
                       byte[] car =new byte[1024]
				Int len=0;
				While(-1!=(len=输入流.read(flush))){
					输出流.write(flush,0,len)
				}
				
				输出流.flush()


4、释放资源：关闭两个流
 */
public class CopyFile {

	public static void main(String[] args)  {
		
		String src ="F:/others/me.jpg";
		String dest ="F:/others/newJpg.jpg";
		try {
			copyFile(src,dest);
		} catch ( FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件不存在");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("复制失败或则关闭流失败");
		}
	}

	/*
	 * 文件的拷贝
	 * 源文件路径
	 * 目标文件路径
	 * IOException
	 */
	public static void copyFile(String srcPath,String destPath) throws FileNotFoundException,IOException {
		//1、建立联系 ：File对象：源(必须存在)和目的(文件可以不存在)
		File src =new File(srcPath);
		File dest =new File(destPath);
		if (!src.isFile()) {
			System.out.println("只能拷贝文件！！！");
			throw new IOException("只能拷贝文件！！！");
		}
		
		//2.选择流:
		InputStream is =new FileInputStream(src);
		OutputStream os=new FileOutputStream(dest);
		//3.文件拷贝:循环：读取+写出
		byte[] flush =new byte[1024];
		int len =0;
		//读取
		while (-1!=(len=is.read(flush))) {
			//写出
			os.write(flush, 0, len);
		}
		os.flush();//强制刷出
		
		//关闭流（规则：先打开的后关闭）
		os.close();
		is.close();
	}
}

