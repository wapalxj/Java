package edu.ynu.lab4;

public class SalesArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sales[][]=
		{{750,660,910,800,0},
		 {800,700,950,900,0},
		 {700,600,750,600,0},
		 {850,800,1000,950,0},
		 {900,800,960,980,0},
		};

		System.out.println("        "+"\t"+"Quarter1"+"\t"+"Quarter2"+"\t"+
						   "Quarter3"+"\t"+"Quarter4"+"\t"+"Total");
		
		int i;
		for ( i = 0; i < sales.length; i++) 
		{
		System.out.print("Dept."+(i+1)+"  ");

			int iLen=sales[i].length;
			for (int j = 0; j < iLen; j++) 
			{
				if (j<iLen-1)
				{
					sales[i][iLen-1]+=sales[i][j];		
				}
				System.out.print("\t"+sales[i][j]+"\t");
			}
			System.out.println();
		
		}
		
		int [] total=new int[sales[0].length]; 
		System.out.print("total:"+"\t");
		for (int j = 0; j < total.length; j++) 
		{
			for (int j2 = 0; j2 < total.length; j2++) 
			{
				total[j]+=sales[j2][j];
			}
			
			System.out.print("\t"+total[j]+"\t");
		}
		System.out.println();
		System.out.println("穆桂海，20121120138");
	}

}
