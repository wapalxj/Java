package cc112_Collecton2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
/**
 * 实现数据存储的表：javabean的简单应用
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args)throws Exception {
		Emploee e =new Emploee(418,"vnix",3000,"school","2015-04");	
		Emploee e2 =new Emploee(418,"vero",3500,"school","2015-04");
		
		List<Emploee> list =new ArrayList<Emploee>();
		
		list.add(e);
		list.add(e2);
		printEmName(list);
		
	}
	public static void printEmName(List<Emploee> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}

}
