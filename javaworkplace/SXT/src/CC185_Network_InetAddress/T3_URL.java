package CC185_Network_InetAddress;

import java.net.MalformedURLException;
import java.net.URL;


public class T3_URL {
	//MalformedURLException:检测URL是否正确
	public static void main(String[] args) throws MalformedURLException {
		//绝对路径
		URL url=new URL("http://www.baidu.com:80/index.html#aa?username=vero");
		System.out.println("协议："+url.getProtocol());
		System.out.println("域名："+url.getHost());
		System.out.println("端口："+url.getPort());
		System.out.println("资源："+url.getFile());
		System.out.println("相对路径："+url.getPath());
		System.out.println("锚点："+url.getRef());
		System.out.println("参数："+url.getQuery());//锚点(#aa)存在则为null,不存在则返回正确
		
		
		
		
		
		//相对路径
//		url=new URL("http://www.baidu.com:80/a/");
//		url=new URL(url,"b.txt");
//		System.out.println(url.toString());
	}

}
