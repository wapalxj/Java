package CC192_Network_ChatRoom3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * �������ݵķ���
 */
public class Send implements Runnable{
	private BufferedReader console;
	private DataOutputStream dos;
	private boolean isRunning=true;
	public Send() {
		//����̨������
		console=new BufferedReader(new InputStreamReader(System.in));
	}
	public Send(Socket client){
		this();
	//�������ͨ������
		try {
			dos=new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			isRunning=false;
			CloseUtil.closeAll(dos,console);
			e.printStackTrace();
		}
	}
	
	/*
	 * 1.�ӿ���̨��������
	 * 2.��������
	 */
	private String getMsgFromConsole() {
		try {
			return console.readLine();
		} catch (IOException e) {
			
		}
		return "";
	}
	public void send() {
		String msg=getMsgFromConsole();
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
			send();
		}
	}

}
