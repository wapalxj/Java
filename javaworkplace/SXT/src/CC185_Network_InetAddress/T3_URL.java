package CC185_Network_InetAddress;

import java.net.MalformedURLException;
import java.net.URL;


public class T3_URL {
	//MalformedURLException:���URL�Ƿ���ȷ
	public static void main(String[] args) throws MalformedURLException {
		//����·��
		URL url=new URL("http://www.baidu.com:80/index.html#aa?username=vero");
		System.out.println("Э�飺"+url.getProtocol());
		System.out.println("������"+url.getHost());
		System.out.println("�˿ڣ�"+url.getPort());
		System.out.println("��Դ��"+url.getFile());
		System.out.println("���·����"+url.getPath());
		System.out.println("ê�㣺"+url.getRef());
		System.out.println("������"+url.getQuery());//ê��(#aa)������Ϊnull,�������򷵻���ȷ
		
		
		
		
		
		//���·��
//		url=new URL("http://www.baidu.com:80/a/");
//		url=new URL(url,"b.txt");
//		System.out.println(url.toString());
	}

}
