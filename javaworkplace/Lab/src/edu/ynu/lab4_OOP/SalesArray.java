package edu.ynu.lab4_OOP;
import javax.naming.spi.DirStateFactory.Result;


public class SalesArray {
	
	private static final int sales[][]=
		{{750,660,910,800,0},
		 {800,700,950,900,0},
		 {700,600,750,600,0},
		 {850,800,1000,950,0},
		 {900,800,960,980,0},
		};;

	public void head_Print() {
		System.out.println("        "+"\t"+"Quarter1"+"\t"+"Quarter2"+"\t"+
				   "Quarter3"+"\t"+"Quarter4"+"\t"+"Total");
	}
	public void clculate_row () {
		int i;
		for ( i = 0; i < this.sales.length; i++) 
		{
		System.out.print("Dept."+(i+1)+"  ");

			int iLen=sales[i].length;
			for (int j = 0; j < iLen; j++) 
			{
				if (j<iLen-1)
				{
					this.sales[i][iLen-1]+=this.sales[i][j];		
				}
				System.out.print("\t"+this.sales[i][j]+"\t");
			}
			System.out.println();
		
		}
		
	}
	public void clculate_col () {
		int [] total=new int[this.sales[0].length]; 
		System.out.print("total:"+"\t");
		for (int j = 0; j < total.length; j++) 
		{
			for (int j2 = 0; j2 < total.length; j2++) 
			{
				total[j]+=sales[j2][j];
			}
			
			System.out.print("\t"+total[j]+"\t");
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesArray s=new SalesArray();
		s.head_Print();
		s.clculate_row();
		s.clculate_col();
		System.out.println("ÄÂ¹ðº£ 20121120138");
	}

}
