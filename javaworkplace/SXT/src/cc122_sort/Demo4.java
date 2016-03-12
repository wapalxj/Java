package cc122_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import c54_stri.Str;

public class Demo4 {

	public static void main(String[] args) {
		Date[] arr =new Date[3];
		arr[0]=new Date();
		arr[1]=new Date(System.currentTimeMillis()-1000*60*60);
		arr[2]=new Date(System.currentTimeMillis()+1000*60*60);
		Utils.sort(arr);
		System.out.println(Arrays.toString(arr));
//字符串
		String[] arr2={"a","abcd","abc","def"};
		Utils.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		
//存放容器
		List<String> list =new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Utils.sort(list);
		System.out.println(list);
//只按长度比较字符串
		System.out.println("=======Comparator排序=========");
		String[] arr3 =new String[]{"a","abcd","abc","def"};
		Utils.sort(arr3,new StringComp());
		System.out.println(Arrays.toString(arr3));
//Comparator排序list		
		System.out.println("=======Comparator排序=========");
		List<String> list2 =new ArrayList<String>();
		list2.add("a");
		list2.add("abcd");
		list2.add("abc");
		list2.add("def");
		Utils.sort(list2,new StringComp());
		System.out.println(list2);
		
	}
	

		
	
}
