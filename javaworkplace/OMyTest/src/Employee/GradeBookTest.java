package Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBookTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		
		Map<String , int[]> s=new HashMap();
		int a[];
		
		
		System.out.println("输入学生人数");
		int num=in.nextInt();
		System.out.println("输入课程 数");
		int cors=in.nextInt();
		
		a=new int[cors];
		
		for (int i = 0; i < num; i++) {
			String name =in.next();
			a=new int[cors];
			for (int j = 0; j < cors; j++) {
				a[j]=in.nextInt();
			}
			s.put(name, a);
		}
		
		
		GradeBook S= new GradeBook(s);
		S.getMax();
		S.getMin();
		S.getAvg();
		S.getView();
	}

}
