package CC143_IO_File;

import java.io.File;

/*
 * �������ó���
 * 1.·���ָ��� ;
 * 2.�ļ��ָ���  \(windows)    /(��windows)
 */
public class Demo01 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//·����ʾ��ʽ
		String path ="F:\\others\\xp.txt";//1(\������ת���ַ���������Ҫ\\)
		path ="F"+File.separator+"others"+File.separator+"xp.txt";//2
		path ="F:/others/xp.txt";//3,�Ƽ��ķ�ʽ
	}

}
