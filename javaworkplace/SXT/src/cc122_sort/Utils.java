package cc122_sort;
/*
 * �Լ���д��ð�����򹤾���
 */
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Utils {
	/*
	 * ���齵��
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
	 * ������������
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
	 * ��������
	 */
	public static<T extends Comparable<T>> void sort(List<T> list) {
		//1.ת������
		Object[] arr=list.toArray();
		sort(arr);
		//2.�ı������ж�Ӧ��ֵ
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
	 * Comparator����list
	 */
	public static<T> void sort(List<T> list,Comparator com) {
		//1.ת������
		Object[] arr=list.toArray();
		sort(arr,com);
		//2.�ı������ж�Ӧ��ֵ
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T)arr[i]);
		}
	}
}
