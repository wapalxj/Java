package CC191_Network_ChatRoom2;
/*����һ���ķ�װ
 * �ͻ��ˣ���������+��������
 * д�����ݣ������
 * ��ȡ���ݣ�������
 * �����������������ͬһ���߳��ڣ��˴˶���
 * ��Ϊ���������У��㷢����Ϣ��������ת����Ⱥ������㲻����ϢҲ�ܽ��ձ��˷�����Ϣ��
 * �����������������Ҫ����
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client=new Socket("localhost",9999);
		new Thread(new Send(client)).start();
		new Thread(new Receive(client)).start();
	}

}
