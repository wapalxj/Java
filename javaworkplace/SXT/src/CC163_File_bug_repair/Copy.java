package CC163_File_bug_repair;

import CC146_IO_Stream.FileUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 解决：
 * 1.父目录拷贝到字母造成目录无线长
 * 2.删除这个无限长的文件夹
 */
public class Copy {
	public static void main(String[] args) {
		//将父目录拷贝到子目录中
		String srcPath="F:/others/ccc";
		String destPath="F:/others/ccc/cccbb";
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
			//判断父目录是否包含子目录，包含则抛出异常
			if (dest.getAbsolutePath().contains(src.getAbsolutePath())){
				try {
					throw new Exception("父目录不能拷贝到子目录中！！！");
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
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
