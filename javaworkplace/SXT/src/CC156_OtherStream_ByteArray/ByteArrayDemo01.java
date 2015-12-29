package CC156_OtherStream_ByteArray;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;



/*
 * 字节数组节点流
 */
public class ByteArrayDemo01 {

	public static void main(String[] args) throws IOException {
		read(write());

	}
	/**
	 * 输入流：操作与文件输入流一致
	 * @throws IOException 
	 */
	public static void read(byte[] src) throws IOException {
		//数据源：src
		//选择流：字节数组输入流(无新增方法可以使用多态)
		InputStream is =new BufferedInputStream(
				new ByteArrayInputStream(src)
		);
		//操作
		byte[] flush =new byte[1024];
		int len=0;
		while (-1!=(len=is.read(flush))) {
			System.out.println(new String(flush,0,len));

		}
		//释放
		is.close();
	}
	public static byte[] write() throws IOException {
		//目的地
		byte[] dest;
		//选择流:字节数组输出流(有新增方法不可以使用多态)
		ByteArrayOutputStream bos =new ByteArrayOutputStream ();
		//写出
		String msg="操作";
		byte[] info=msg.getBytes();
		bos.write(info,0,info.length);
		//获取
		dest=bos.toByteArray();
		bos.close();
		return dest;
	}

}
