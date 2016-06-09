package CC200_httpserver_Package_Request;

import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/*
 * ¹Ø±ÕÁ÷
 */
public class CloseUtil {
	public static void closeAll(Closeable...io) {
		for (Closeable temp:io) {
			if (null!=temp) {
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void closeSocket(ServerSocket socket) {

			if (null!=socket) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}
	public static void closeSocket(Socket socket) {

		if (null!=socket) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
