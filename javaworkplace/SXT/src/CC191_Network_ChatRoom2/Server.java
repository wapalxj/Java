package CC191_Network_ChatRoom2;
/*
 * д�����ݣ������
 * ��ȡ���ݣ�������
 * ��һ��ʵ����һ���ͻ��˲��ϵ����������������
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		//�������Ӷ���ͻ���
		while (true) {
			ServerSocket server=new ServerSocket(9999);
			Socket client=server.accept();
			
			//������:�ӿͻ��˽���
			DataInputStream dis=new DataInputStream(client.getInputStream());
			//�������������ͻ���
			DataOutputStream dos=new DataOutputStream(client.getOutputStream());
			//�����ؿͻ��˶�ȡ�ʹ�������ͻ���
			while (true) {
				String msg=dis.readUTF();
				System.out.println("���������յ���"+msg);
				
				dos.writeUTF("��������->>"+msg);
				dos.flush();
			}
			
		}
		
	}

}
