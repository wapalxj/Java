package c60_multidnArray;

public class Matrix {

	/**
	 * ∂‡Œ¨æÿ’Û
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a={{1,3},
				   {2,4}
				  };
		int [][]b={{3,4},
				   {5,6}
				  };
		int [][]c=new int[2][2];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for (int []k:c) {
			for (int i : k) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
