package CC143_IO_File;

import java.io.File;

/*
 * 两个常用常量
 * 1.路径分隔符 ;
 * 2.文件分隔符  \(windows)    /(非windows)
 */
public class Demo01 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//路径表示形式
		String path ="F:\\others\\xp.txt";//1(\本身是转义字符，所以需要\\)
		path ="F"+File.separator+"others"+File.separator+"xp.txt";//2
		path ="F:/others/xp.txt";//3,推荐的方式
	}

}
