package c62_Arraysfun;

import java.util.Arrays;

public class Arraysfun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,5,78,45,12,35};
		Arrays.sort(a);//序
		System.out.println(Arrays.toString(a));//静态toString方法
		System.out.println(Arrays.binarySearch(a, 12));//二分法查找
	}

}
