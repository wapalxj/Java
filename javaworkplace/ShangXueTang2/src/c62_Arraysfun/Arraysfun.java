package c62_Arraysfun;

import java.util.Arrays;

public class Arraysfun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,5,78,45,12,35};
		Arrays.sort(a);//��
		System.out.println(Arrays.toString(a));//��̬toString����
		System.out.println(Arrays.binarySearch(a, 12));//���ַ�����
	}

}
