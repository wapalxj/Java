package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DDate {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		
		System.out.println(format.format(date.getTime()));
	}

}
