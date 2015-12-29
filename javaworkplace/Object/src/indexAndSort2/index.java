package indexAndSort2;

import java.util.Scanner;

public class index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二分法查找
		Scanner in =new Scanner(System.in);
		int[] a={0,1,2,3,4,5,6};
		int k=in.nextInt();
		System.out.println(search(k, a));

	}
	public static int search(int k,int[] a)
	{
		int ret=0;
		int l=0;
		int h=a.length;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==k)
			{
				ret=m;break;
			}
			else if(a[m]>k)
			{
				h=m-1;
			}
			else 
			{
				l=m+1;
			}

		}

		return ret;
	}

}
