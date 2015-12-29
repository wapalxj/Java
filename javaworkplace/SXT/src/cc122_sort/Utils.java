package cc122_sort;
/*
 * 自己编写的冒泡排序工具类
 */
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Utils {
	/*
	 * 数组降序
	 */
	public static void sort(Object[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (((Comparable)arr[j]).compareTo(arr[j+1])>0) {
					Object temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	/*
	 * 泛型数组排序
	 * 
	 */
	public static<T extends Comparable<T>> void sort(T[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (((Comparable)arr[j]).compareTo(arr[j+1])>0) {
					T temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	/*
	 * 容器排序
	 */
	public static<T extends Comparable<T>> void sort(List<T> list) {
		//1.转成数组
		Object[] arr=list.toArray();
		sort(arr);
		//2.改变容器中对应的值
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T)arr[i]);
		}
	}
	/*
	 * Comparator
	 */
	public static void sort(Object[] arr,Comparator com) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (com.compare(arr[j],arr[j+1])>0) {
					Object temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	/*
	 * Comparator排序list
	 */
	public static<T> void sort(List<T> list,Comparator com) {
		//1.转成数组
		Object[] arr=list.toArray();
		sort(arr,com);
		//2.改变容器中对应的值
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T)arr[i]);
		}
	}
}
