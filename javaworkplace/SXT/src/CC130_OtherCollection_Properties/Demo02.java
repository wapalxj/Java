package CC130_OtherCollection_Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 使用Properties输出到文件（ 资源配置文件）
 *1.store(OutputStream out,String comments)
 *	store(Writer writer,String comments)
  2.storeToXML(OutputStream os,String comments)
	storeToXML(OutputStream os,String comments,String encoding)


 */
public class Demo02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro =new Properties();
		//存储
		pro.setProperty("vero","Alicc");
		pro.setProperty("vnix","Alicc2");
		pro.setProperty("vvvv","Alicc3");
		pro.setProperty("veeee","Alicc4");
		
		//存储到e:/others(使用绝对路径)
//		pro.store(new FileOutputStream(new File("e:/others/db.properties")), "db配置");
//		pro.storeToXML(new FileOutputStream(new File("e:/others/db.properties")), "db配置");
		
		//存储到(使用相对路径，当前工程中)
		pro.store(new FileOutputStream(new File("src/CC130_OtherCollection_Properties/db.properties")), "db配置");
	}

}
