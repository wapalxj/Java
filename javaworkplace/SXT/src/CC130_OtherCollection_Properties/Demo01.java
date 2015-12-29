package CC130_OtherCollection_Properties;

import java.util.Properties;


/*
 * Properties资源配置文件的读写
 * 1.key与value只能是字符串
 * 2.存储与读取
 */
public class Demo01 {

	public static void main(String[] args) {
		Properties pro =new Properties();
		//存储
		pro.setProperty("vero","Alicc");
		pro.setProperty("vnix","Alicc");
		pro.setProperty("vvvv","Alicc");
		pro.setProperty("veeee","Alicc");
		
		
		String str=pro.getProperty("vero","test");
		String str2=pro.getProperty("vcccc","test");
		System.out.println(str);//存在vero对应的字符串值，则使用自己的值
		System.out.println(str2);//不存在vcccc对应的字符串值，则使用给定的test
	}

}
