package CC193_Network_ChatRoom4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * 用于数据的发送
 */
public class Send implements Runnable{
	private BufferedReader console;
	private DataOutputStream dos;
	private boolean isRunning=true;
	private String name;
	public Send() {
		//控制台输入流
		console=new BufferedReader(new InputStreamReader(System.in));
	}
	public Send(Socket client,String name){
		this();
	//输出流：通过传参
		try {
			dos=new DataOutputStream(client.getOutputStream());
			this.name=name;
			send(this.name);
		} catch (IOException e) {
			isRunning=false;
			CloseUtil.closeAll(dos,console);
			e.printStackTrace();
		}
	}
	
	/*
	 * 1.从控制台接收数据
	 * 2.发送数据
	 */
	private String getMsgFromConsole() {
		try {
			return console.readLine();
		} catch (IOException e) {
			
		}
		return "";
	}
	public void send(String msg) {
		if (null!=msg&&!msg.equals("")) {
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				isRunning=false;
				CloseUtil.closeAll(dos,console);
			}
		}
	}
	@Override
	public void run() {
		while (isRunning) {
			send(getMsgFromConsole());
		}
	}

}
