package CC193_Network_ChatRoom4;

import java.io.Closeable;
import java.io.IOException;


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
	public static void main(String[] args) {
		
	}

}
