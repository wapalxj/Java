package CC193_Network_ChatRoom4;
/*
 * 这一步完善了聊天室
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
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
		private String name;
		public MyChannel(Socket client) {
			try {
				dis=new DataInputStream(client.getInputStream());
				dos=new DataOutputStream(client.getOutputStream());
				this.name=dis.readUTF();
				send("欢迎进入聊天室");
				sendOthers(this.name+"进入了聊天室",true);
				
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
				sendOthers(this.name+"离开了聊天室",true);
			}
			return msg;
		}
		/*
		 * 发送数据给客户端
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
				sendOthers(this.name+"离开了聊天室",true);
			}
		}
		/*
		 * 发送给其他客户端
		 * 
		 */
		public void sendOthers(String msg,boolean sys) {
			//私聊
			if (msg.startsWith("@")&&(msg.indexOf(":")>-1)) {
				//获取name
				String name =msg.substring(1,msg.indexOf(":"));
				String content =msg.substring(msg.indexOf(":")+1);
				for (MyChannel other : all) {
					if (other.name.equals(name)) {
						other.send(this.name+"对你悄悄说："+content);
					}
				}
			}else {
				//群发遍历
				for (MyChannel other : all) {
					if (other==this) {
						continue;
					}
					if (sys) {//系统信息
						other.send("系统信息:"+msg);
					}else{
						//发送给其他的客户端
						other.send(this.name+"对所有人说："+msg);
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
