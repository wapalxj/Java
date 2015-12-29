package c70_fileClass;

import java.io.File;
/**
 * ÎÄ¼þÊ÷
 * @author Administrator
 *
 */
public class FileTree {
	public static void main(String[] args) {
		File f =new File("d:/src");
		printFile(f,0);
	}
	
	static void printFile(File file,int level){
		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		
		if (file.isDirectory()) {
			File[] files =file.listFiles();
			for (File temp:files) {
				printFile(temp,level+1);
			}
		}
	}
}
