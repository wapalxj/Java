package CC143_IO_File;

import java.io.File;



/*
 * ���·�������·������File
 * 1.���·��
 * 	 File(String parent,String child)==>File("E:/others/","xp.txt");
 * 	 File(String parent,String child)==>File(new File("E:/others/"),"xp.txt");
 * 2.����·��
 *	 
 */
public class Demo02 {

	public static void main(String[] args) {
		String parentPath ="F:/others/";
		String name ="xp.txt";
		//���·��
		File src =new File(parentPath,name);
		//����
		src =new File(new File(parentPath),name);
		//���
		System.out.println("#####���·��######");
		System.out.println("name: "+src.getName());
		System.out.println("path: "+src.getPath());
		
		
		//����·��
		System.out.println("##########����·��#########");
		src =new File("F:/others/xp.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
		
		//û���̷�������user.dir����
		System.out.println("##########û���̷�##########");
		src =new File("test.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
	}

}
