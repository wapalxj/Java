package CC130_OtherCollection_enumeration;

import java.util.StringTokenizer;

/*
 * StringTokenizer:Enumeration的子类
 * StringTokenizer:String split():字符串分割
 */

public class Demo02 {
	public static void main(String[] args) {
		String emaiStr ="vero@163.com,vero@qq.com,vero@outlook.com";
		StringTokenizer token =new StringTokenizer(emaiStr,",");
		
		while (token.hasMoreElements()) {
			System.out.println(token.nextElement());
			
		}
	}
}
