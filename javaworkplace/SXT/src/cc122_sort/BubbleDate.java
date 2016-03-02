package cc122_sort;

import java.util.Date;

/*
 * Comperable接口:Date排序
 */
public class BubbleDate {

	public static void main(String[] args) {
		Date[] arr =new Date[3];
		arr[0]=new Date();
		arr[1]=new Date(System.currentTimeMillis()-1000*60*60);
		arr[2]=new Date(System.currentTimeMillis()+1000*60*60);

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (((Comparable)arr[j]).compareTo(arr[j+1])>0) {
					Date temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (Date i : arr) {
			System.out.println(i.toGMTString());
		}
	}

}
