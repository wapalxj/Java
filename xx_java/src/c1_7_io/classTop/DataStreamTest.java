package c1_7_io.classTop;

import java.io.*;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		testDataOutPutStream();
		testDataInputStreamI();
	}
	
	private static void testDataOutPutStream() {
		
		try {
//			File file = new File("src/c1_7_io/testtxt/tataStreamTest.txt");

			DataOutputStream out = new DataOutputStream(
					new	BufferedOutputStream(
					new FileOutputStream(
					new File("src/c1_7_io/testtxt/tataStreamTest.txt"))));

			out.writeChar('篳');
			out.writeBoolean(true);
            out.writeByte((byte)0x41);
            out.writeChar((char)0x4243);
            out.writeShort((short)0x4445);
            out.writeInt(0x12345678);
            out.writeLong(0x987654321L);
            out.writeUTF("abcdefghijklmnopqrstuvwxyz??12");
            out.writeLong(0x023433L);
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void testDataInputStreamI() {
		try {

			File file = new File("src/c1_7_io/testtxt/tataStreamTest.txt");
			DataInputStream in = new DataInputStream(
					new BufferedInputStream(
					new FileInputStream(file)));


			System.out.println(in.readChar());
//			System.out.println(Long.toHexString(in.readLong()));
			System.out.println(in.readBoolean());
			System.out.println(byteToHexString(in.readByte()));
			System.out.println(charToHexString(in.readChar()));
			System.out.println(shortToHexString(in.readShort()));
			System.out.println(Integer.toHexString(in.readInt()));
			System.out.println(Long.toHexString(in.readLong()));
			System.out.println(in.readUTF());
			System.out.println(Long.toHexString(in.readLong()));
			in.close();


		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
    // ???byte?????16??????????
    private static String byteToHexString(byte val) {
        return Integer.toHexString(val & 0xff);
    }

    // ???char?????16??????????
    private static String charToHexString(char val) {
        return Integer.toHexString(val);
    }

    // ???short?????16??????????
    private static String shortToHexString(short val) {
        return Integer.toHexString(val & 0xffff);
    }

}
