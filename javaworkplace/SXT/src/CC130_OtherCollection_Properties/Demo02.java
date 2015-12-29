package CC130_OtherCollection_Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * ʹ��Properties������ļ��� ��Դ�����ļ���
 *1.store(OutputStream out,String comments)
 *	store(Writer writer,String comments)
  2.storeToXML(OutputStream os,String comments)
	storeToXML(OutputStream os,String comments,String encoding)


 */
public class Demo02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro =new Properties();
		//�洢
		pro.setProperty("vero","Alicc");
		pro.setProperty("vnix","Alicc2");
		pro.setProperty("vvvv","Alicc3");
		pro.setProperty("veeee","Alicc4");
		
		//�洢��e:/others(ʹ�þ���·��)
//		pro.store(new FileOutputStream(new File("e:/others/db.properties")), "db����");
//		pro.storeToXML(new FileOutputStream(new File("e:/others/db.properties")), "db����");
		
		//�洢��(ʹ�����·������ǰ������)
		pro.store(new FileOutputStream(new File("src/CC130_OtherCollection_Properties/db.properties")), "db����");
	}

}
