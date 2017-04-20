package C13_String;

import java.util.Arrays;
import java.util.Random;

public class P294_dump {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(String.format("%05x", 15));
		
		byte[] data=new byte[60];
//		new Random(47).nextBytes(data);
		for (int i = 0; i < 60; i++) {
			data[i]=(byte) i;
		}
		Integer []integer={10,20,30};
		
		System.out.println(Hex.format(data));
	}

}

class Hex {
	public static String format(byte[] data) {
		StringBuilder res = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if (n % 16 == 0) {
				res.append(String.format("%05x: ", n));
			}
			res.append(String.format("%02x ", b));
			n++;
			if (n % 16 == 0) {
				res.append("\n");
			}
		}
		return res.toString();
	}
}