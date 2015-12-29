package CC192_Network_ChatRoom3;
/*
 * д�����ݣ������
 * ��ȡ���ݣ�������
 * ��һ��ʵ���˶���ͻ��˲��ϵ����������������
 * ʹ���ڲ���
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Server {
	private List<MyChannel> all=new ArrayList<MyChannel>();//�����������йܵ�(Socket)
	public static void main(String[] args) throws IOException {
		new Server().start();
			
	}
	
	public void start() throws IOException {
		ServerSocket server=new ServerSocket(9999);
		//���Ӷ���ͻ���
		while (true) {
			Socket client=server.accept();
			MyChannel channel =new MyChannel(client);
			all.add(channel);
			new Thread(channel).start();//һ����·
		}
	}
	/**
	 * һ���ͻ��˶�Ӧһ����·
	 * 1.����������������
	 * 2.���������������
	 * @author Administrator
	 *
	 */
	private class MyChannel implements Runnable{
		//������:�ӿͻ��˽���
		private DataInputStream dis;
		//�������������ͻ���
		private DataOutputStream dos;
		private boolean isRunnng=true;
		public MyChannel(Socket client) {
			try {
				dis=new DataInputStream(client.getInputStream());
				dos=new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {
//				e.printStackTrace();

				CloseUtil.closeAll(dis,dos);
				isRunnng=false;
			}
		}
		/*
		 * ��������
		 */
		private String receive() {
			String msg="";
			try {
				msg=dis.readUTF();
			} catch (IOException e) {
//				e.printStackTrace();
				CloseUtil.closeAll(dis);
				isRunnng=false;
				all.remove(this);
			}
			return msg;
		}
		/*
		 * ��������
		 */
		private void send(String msg) {
			if(null==msg||msg.equals("")){
				return;
			}
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
//				e.printStackTrace();
				CloseUtil.closeAll(dos);
				isRunnng=false;			
				all.remove(this);
			}
				
		}
		/*
		 * ���͸������ͻ���
		 * 
		 */
		public void sendOthers() {
			String msg =receive();
//			for (MyChannel other : all) {
//				if (other==this) {
//					continue;
//				}
				//���͸������Ŀͻ���
//				other.send(msg);
//			}
			Iterator<MyChannel> it=all.iterator();
			while (it.hasNext()) {
				MyChannel other = (MyChannel) it.next();
				if (other==this) {
					continue;
				}
				other.send(msg);
			}
		}
		
		@Override
		public void run() {
			while (isRunnng) {
				sendOthers();
//				send(receive());
			}
		}
		
	}

}
