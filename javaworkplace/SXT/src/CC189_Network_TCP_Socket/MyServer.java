package CC189_Network_TCP_Socket;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*������Ҫ������������
 * 1.���������,ָ���˿�
 * 2.���տͻ�������
 * 3.���ͺͽ�������
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		//1.���������,ָ���˿�
		ServerSocket server=new ServerSocket(8888);
		//2.���տͻ�������:����ʽ���ȴ��ͻ�������
		Socket socket=server.accept();
		System.out.println("sssssssssss");
		//3.��������
		String msg="vero";
		
		//�����1
//		BufferedWriter bw= new BufferedWriter(
//				new OutputStreamWriter(
//					socket.getOutputStream())
//		);
//		bw.write(msg);
//		bw.newLine();
//		bw.flush();
		//����2��
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
	}

}
