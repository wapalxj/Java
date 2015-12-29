package CC185_Network_InetAddress;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;



public class T4_URL_GET {

	public static void main(String[] args) throws IOException {
		URL url=new URL("http://www.baidu.com");
		
		//会乱码
//		InputStream is=url.openStream();
//		byte[] flush=new byte[1024];
//		int len=0;
//		while (-1!=(len=is.read(flush))) {
//			System.out.println(new String(flush,0,len));
//		}
//		is.close();
		//不会乱码
		BufferedReader br=new BufferedReader(
				new InputStreamReader(url.openStream(),"utf-8"));

		BufferedWriter bw=new BufferedWriter(//写出到外部
				new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
		String msg=null;
		while ((msg=br.readLine())!=null) {
			System.out.println(msg);
			bw.append(msg);//写出到外部
			bw.newLine();//写出到外部
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
