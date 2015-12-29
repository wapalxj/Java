

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo04 {

	public static void main(String[] args) {
		String path ="D:/";
		File src =new File(path);
		List<String> list =new ArrayList<>();
		
//		File [] subFiles=src.listFiles();
//		if (subFiles!=null) {
//			for (File file: subFiles) {
//				Name(file,list);
//			}
//		}
		Name(src,list);
		
			
		Collections.sort(list);
			for (String file: list) {
				System.out.println(file);
			}

		
	}
	public static void Name(File src,List<String> list) {
//		if (null==src||!src.exists()) {
//			return ;
//		}
//		
//		String name =src.getName();
//		if (name.endsWith(".java")) {
//			list.add(name);
//		}
//		
//		if (src.isDirectory()) {
//			for (File sub : src.listFiles()) {
//				Name(sub,list);
//			}
//		}
		File[] files =src.listFiles();
		if (files!=null) {
			for (File f : files) {
				String fname =f.getName();
				if (fname.endsWith(".java")) {
					list.add(fname);
				}
				Name(f,list);
			}
		}
	
	}

}
