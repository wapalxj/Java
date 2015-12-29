package CC193_Network_ChatRoom4;
/*
 * ��һ��������������
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
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
		private String name;
		public MyChannel(Socket client) {
			try {
				dis=new DataInputStream(client.getInputStream());
				dos=new DataOutputStream(client.getOutputStream());
				this.name=dis.readUTF();
				send("��ӭ����������");
				sendOthers(this.name+"������������",true);
				
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
				sendOthers(this.name+"�뿪��������",true);
			}
			return msg;
		}
		/*
		 * �������ݸ��ͻ���
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
				sendOthers(this.name+"�뿪��������",true);
			}
		}
		/*
		 * ���͸������ͻ���
		 * 
		 */
		public void sendOthers(String msg,boolean sys) {
			//˽��
			if (msg.startsWith("@")&&(msg.indexOf(":")>-1)) {
				//��ȡname
				String name =msg.substring(1,msg.indexOf(":"));
				String content =msg.substring(msg.indexOf(":")+1);
				for (MyChannel other : all) {
					if (other.name.equals(name)) {
						other.send(this.name+"��������˵��"+content);
					}
				}
			}else {
				//Ⱥ������
				for (MyChannel other : all) {
					if (other==this) {
						continue;
					}
					if (sys) {//ϵͳ��Ϣ
						other.send("ϵͳ��Ϣ:"+msg);
					}else{
						//���͸������Ŀͻ���
						other.send(this.name+"��������˵��"+msg);
					}
					
				}
			}
			
		}
		
		@Override
		public void run() {
			while (isRunnng) {
				sendOthers(receive(),false);
//				send(receive());
			}
		}
		
	}

}
