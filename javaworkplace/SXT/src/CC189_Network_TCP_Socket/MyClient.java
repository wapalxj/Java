package CC189_Network_TCP_Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/*TCP:�ͻ��˲�������������쳣
 * �����ͻ���:����ָ��������+�˿�
 */
public class MyClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1.�����ͻ���
		Socket client=new Socket("localhost",8888);
		//2.��������
		//�����1:
//		BufferedReader br=new BufferedReader(
//				new InputStreamReader(client.getInputStream())
//		);
//		String echo =br.readLine();//���ʵ����Ҳ�������ķ�������Ҫ�н���������bw.newLine
//		System.out.println(echo);
		//����2��
		DataInputStream dis=new DataInputStream(client.getInputStream());
		String echo =dis.readUTF();
		System.out.println(echo);
		
	}

}
