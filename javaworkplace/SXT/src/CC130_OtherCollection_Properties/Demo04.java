package CC130_OtherCollection_Properties;

import java.io.IOException;
import java.util.Properties;

/*
 * ʹ�������·����ȡ�����ļ�
 * bin
 */
public class Demo04 {

	public static void main(String[] args) throws IOException {
		Properties pro =new Properties();
		//ʹ�������·����1�� / ��ʾbin
//		pro.load(Demo04.class.getResourceAsStream("/CC130_OtherCollection_Properties/db.properties"));
		//:2��ʹ���������""��ʾbin�����ã�
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("CC130_OtherCollection_Properties/db.properties"));
		System.out.println(pro.getProperty("vero","test"));

	}

}
