package CC130_OtherCollection_Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


/*
 * 使用Properties读取配置文件
 * 	load(IputStream inStream)
	load(Reader reader)
	loadFromXML(InputStream in)

 */
public class Demo03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro =new Properties();
		//读取绝对路径
//		pro.load(new FileReader("e:/others/db.properties"));
		//读取相对路径
		pro.load(new FileReader("src/CC130_OtherCollection_Properties/db.properties"));
		System.out.println(pro.getProperty("vero","test"));
	}

}
