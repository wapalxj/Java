package CC190_Network_ChatRoom;
/*
 * д�����ݣ������
 * ��ȡ���ݣ�������
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(9999);
		Socket client=server.accept();
		
		//������:�ӿͻ��˽���
		DataInputStream dis=new DataInputStream(client.getInputStream());
		String msg=dis.readUTF();
		System.out.println("���������յ���"+msg);
		//�������������ͻ���
		DataOutputStream dos=new DataOutputStream(client.getOutputStream());
		dos.writeUTF("��������->>"+msg);
		dos.flush();
}

}
