package CC146_IO_Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �ļ��еĿ���
 * 1.�ļ����ƣ�copyFile
 * 2.�ļ��д�����mkdirs
 * 3.�ݹ������Ŀ¼
 */
public class Directory {
	public static void main(String[] args) {
		//Դ
		String srcPath="F:/others/copy";
//		String srcPath="E:/others/xp.txt";
		//Ŀ��
//		String destPath="F:/others/p12";
		String destPath="F:/ccc";
		copyDir(srcPath,destPath);
		
		
	}
	/*
	 *�����ļ���
	 */
	public static void copyDir(String srcPath,String destPath) {
		File src =new File(srcPath);
		File dest =new File(destPath);
		copyDir(src,dest);
		
	}
	/*
	 *�����ļ���
	 */
	public static void copyDir(File src,File dest) {
		if (src.isDirectory()) {
			dest =new File(dest,src.getName());
		}
		copyDirDetail(src,dest);
	}
	/*
	 * ����ϸ��
	 */
	public static void copyDirDetail(File src,File dest) {
		if (src.isFile()) {
			try {
				FileUtil.copyFile(src, dest);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(src.isDirectory()){
			dest.mkdirs();//ȷ��Ŀ¼�ļ��д���
			for (File sub : src.listFiles()) {
				copyDirDetail(sub, new File(dest,sub.getName()));
				
			}
		}	
	}

}
