import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Find {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("请输入盘符（按格式：D:/）");
		String root=in.nextLine();
		System.out.println("请输入后缀（按格式：.java）");
		String name =in.nextLine();
		
		File file =new File(root);
		List<String> list =new ArrayList<>();
		search(file,list,name);
		System.out.println(root+"盘上的后缀名为："+name+"的文件有:");
		
		Collections.sort(list);
		for (String files: list) {
			System.out.println(files);
		}
	}
	public static void search(File file,List list,String name) {
		File[] files =file.listFiles();
		if (files!=null) {
			for (File f : files) {
				String fname =f.getName();
				if (fname.endsWith(name)) {
					list.add(fname);
				}
				search(f,list,name);
			}
		}
		
	}

}
