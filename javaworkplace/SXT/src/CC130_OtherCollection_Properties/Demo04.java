package CC130_OtherCollection_Properties;

import java.io.IOException;
import java.util.Properties;

/*
 * 使用类相对路径读取配置文件
 * bin
 */
public class Demo04 {

	public static void main(String[] args) throws IOException {
		Properties pro =new Properties();
		//使用类相对路径的1： / 表示bin
//		pro.load(Demo04.class.getResourceAsStream("/CC130_OtherCollection_Properties/db.properties"));
		//:2：使用类加载器""表示bin（常用）
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("CC130_OtherCollection_Properties/db.properties"));
		System.out.println(pro.getProperty("vero","test"));

	}

}
