package CC200_httpserver_Package_Request;

import java.io.Closeable;
import java.io.IOException;


/*
 * �ر���
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

}
