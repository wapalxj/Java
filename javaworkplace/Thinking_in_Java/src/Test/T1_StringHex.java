package Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T1_StringHex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] b=new byte[]{17,2,3,4,5,6};
//		System.out.println(byteToHexString(b));
		String hexStr="123456";
		System.out.println(Arrays.toString(hexStrToBytes(hexStr)));

	}
	public static String byteToHexString(byte[] b) {
		StringBuffer hexString = new StringBuffer(16);
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			System.out.println(hex);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			hexString.append(hex.toUpperCase());
		}
		return hexString.toString();
	}
	/**
     * 16进制转换为字节数组
     * 
     * @param
     * @return
     */
    public static byte[] hexStrToBytes(String hexStr)
      {
        if(hexStr.length()<1)
          return null;
        byte[] result=new byte[hexStr.length()/2];
        for(int i=0;i<hexStr.length()/2;i++)
          {
            int high=Integer.parseInt(hexStr.substring(i*2,i*2+1),16);
            int low=Integer.parseInt(hexStr.substring(i*2+1,i*2+2),16);
            result[i]=(byte)(high*16+low);
          }
        return result;
      }
	
}
