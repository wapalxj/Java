package CC15_5_Works;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/*
 * 支持输入增量匹配，在上一个实现的基础上
 */
public class Co7_Match {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String []WebSitesArray ={"www.qw.com",
							"www.qw2.com",
							"www.qw23.com",
							"www.qw234.com",
							"www.qw2345.com",
		};
		
		List<String> WebSites =new ArrayList<String>();
		for (String string : WebSitesArray) {
			WebSites.add(string);
		}
		
		System.out.println("请输入：");
		match((ArrayList)WebSites,in.nextLine());
		
	}
	public static void match(ArrayList<String> WebSites,String webSite) {
		System.out.println("匹配到的网站为：");
		boolean isMatch;
		for (int k = 0; k < WebSites.size(); k++) {
			isMatch=false;
			String word =WebSites.get(k);
			LinkedList<String> list =new LinkedList<>();
			String[]chars =word.split("");
			for (String string : chars) {
				list.push(string);
			}
			
			LinkedList<String> list2 =(LinkedList<String>) list.clone();
			String []temp =webSite.split("");
			int f=0;
			for (int i = 0; i < webSite.length(); i++) {
				if (temp[i].equals(list2.pollLast())) {
					f++;
				}
				else {
					break;
				}
			}
			
			if (webSite.length()==f) {
				isMatch=true;
				for (int i = list.size()-1; i >=0  ; i-- )
				{
					System.out.print(list.get(i));
				}
			}
			if (isMatch) {
				System.out.println();
			}
			
		}
	}

}
