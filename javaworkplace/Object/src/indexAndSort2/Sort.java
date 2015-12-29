package indexAndSort2;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//—°‘Ò≈≈–Ú
		int[] a=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100);
		}
		for(int k:a)
		{
		System.out.print(k+" ");
		}
		
		System.out.println();
		
		sort(a);
		
		for(int k:a)
		{
		System.out.print(k+" ");
		}
	}
	public static void sort(int[] a)
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			int idx=0;
			for(int j=1;j<a.length-i;j++)
			{	if(a[j]>a[idx])
				{
					idx=j;
				}
			}
			int t=a[idx];
			a[idx]=a[a.length-i-1];
			a[a.length-i-1]=t;
			
		}
//		for(int i=a.length-1;i>0;i--)
//		{
//			int idx=0;
//			for(int j=1;j<=i;j++)
//			{	if(a[j]>a[idx])
//				{
//					idx=j;
//				}
//			}
//			int t=a[idx];
//			a[idx]=a[i];
//			a[i]=t;
//			
//		}

	}

}
