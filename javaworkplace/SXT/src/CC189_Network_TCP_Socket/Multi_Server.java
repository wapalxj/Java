package CC189_Network_TCP_Socket;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*һ��������������ͻ���
 */
public class Multi_Server {

	public static void main(String[] args) throws IOException {
		//1.���������,ָ���˿�
		ServerSocket server=new ServerSocket(8888);
		//2.���տͻ�������:����ʽ���ȴ��ͻ�������
		while (true) {//��ѭ����һ��accept,һ���ͻ���
			Socket socket=server.accept();
			System.out.println("sssssssssss");
			//3.��������
			String msg="vero";
			//�������
			DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(msg);
			dos.flush();
			
		}
	}

}
