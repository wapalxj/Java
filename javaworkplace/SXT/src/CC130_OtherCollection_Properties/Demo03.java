package CC130_OtherCollection_Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


/*
 * ʹ��Properties��ȡ�����ļ�
 * 	load(IputStream inStream)
	load(Reader reader)
	loadFromXML(InputStream in)

 */
public class Demo03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro =new Properties();
		//��ȡ����·��
//		pro.load(new FileReader("e:/others/db.properties"));
		//��ȡ���·��
		pro.load(new FileReader("src/CC130_OtherCollection_Properties/db.properties"));
		System.out.println(pro.getProperty("vero","test"));
	}

}
