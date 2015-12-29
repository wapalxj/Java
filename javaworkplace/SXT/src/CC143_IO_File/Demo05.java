package CC143_IO_File;

import java.io.File;
import java.util.Arrays;

/*
 * ������ＶĿ¼�����ļ�������(����·��)
 * 1.listFiles()
 * 2.�ݹ�
 * 
 * static listRoots()��·��
 */
public class Demo05 {

	public static void main(String[] args) {
		String path ="F:/others/p5";
		File par =new File(path);
		Name(par);
		
//		��ӡ�����̷���·��
		File[] roots=File.listRoots();
		System.err.println(Arrays.toString(roots));

	}
	//���·��
	public static void Name(File src) {
		if (null==src||!src.exists()) {
			return;
		}
		System.err.println(src.getAbsolutePath());
		if (src.isDirectory()) {
			for (File sub : src.listFiles()) {
				Name(sub);
			}
		}
	}

}



