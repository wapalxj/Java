package CC192_Network_ChatRoom3;
/*
 * 写出数据：输出流
 * 读取数据：输入流
 * 这一步实现了多个客户端不断的与服务器交互数据
 * 使用内部类
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
	private List<MyChannel> all=new ArrayList<MyChannel>();//用来管理所有管道(Socket)
	public static void main(String[] args) throws IOException {
		new Server().start();
			
	}
	
	public void start() throws IOException {
		ServerSocket server=new ServerSocket(9999);
		//连接多个客户端
		while (true) {
			Socket client=server.accept();
			MyChannel channel =new MyChannel(client);
			all.add(channel);
			new Thread(channel).start();//一条道路
		}
	}
	/**
	 * 一个客户端对应一条道路
	 * 1.输入流：接收数据
	 * 2.输出流：发送数据
	 * @author Administrator
	 *
	 */
	private class MyChannel implements Runnable{
		//输入流:从客户端接收
		private DataInputStream dis;
		//输出流：输出到客户端
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
		 * 接收数据
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
		 * 发送数据
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
		 * 发送给其他客户端
		 * 
		 */
		public void sendOthers() {
			String msg =receive();
//			for (MyChannel other : all) {
//				if (other==this) {
//					continue;
//				}
				//发送给其他的客户端
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
