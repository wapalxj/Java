package CC146_IO_Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 文件夹的拷贝
 * 1.文件复制：copyFile
 * 2.文件夹创建：mkdirs
 * 3.递归查找子目录
 */
public class Directory {
	public static void main(String[] args) {
		//源
		String srcPath="F:/others/copy";
//		String srcPath="E:/others/xp.txt";
		//目标
//		String destPath="F:/others/p12";
		String destPath="F:/ccc";
		copyDir(srcPath,destPath);
		
		
	}
	/*
	 *拷贝文件夹
	 */
	public static void copyDir(String srcPath,String destPath) {
		File src =new File(srcPath);
		File dest =new File(destPath);
		copyDir(src,dest);
		
	}
	/*
	 *拷贝文件夹
	 */
	public static void copyDir(File src,File dest) {
		if (src.isDirectory()) {
			dest =new File(dest,src.getName());
		}
		copyDirDetail(src,dest);
	}
	/*
	 * 拷贝细节
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
			dest.mkdirs();//确保目录文件夹存在
			for (File sub : src.listFiles()) {
				copyDirDetail(sub, new File(dest,sub.getName()));
				
			}
		}	
	}

}
