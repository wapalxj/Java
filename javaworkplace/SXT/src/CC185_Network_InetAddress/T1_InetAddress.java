package CC185_Network_InetAddress;
/*
 * 没有封装端口
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class T1_InetAddress {

	public static void main(String[] args) throws UnknownHostException {
		//使用getLocalHost方法创建InetAddress对象
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());//IP地址
		System.out.println(addr.getHostName());//输出主机名
		
	
		//根据域名得到InetAddress对象
		addr=InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());//返回baidu服务器IP地址
		System.out.println(addr.getHostName());//输出域名
		
		//根据IP得到InetAddress对象
		addr=InetAddress.getByName("119.75.218.70");
		System.out.println(addr.getHostAddress());//返回baidu服务器IP地址
		System.out.println(addr.getHostName());//输出IP,如果DNS解析的话，就返回域名
	}

}
