package edu.ynu.labz12.copy;

public class Sort {
	public int[] AscendSort(int array[]){//��������
	     for (int pass = 1; pass < array.length; pass++){
		       for (int element = 0;element < (array.length - 1); element++){
		    	   if (array[element] > array[element + 1]){  
		    		   swap(array,element,element + 1);
		    	   }
		       } 
	     }  
	    return array;
	} 
	  
	 public int[] DescendSort(int array[]){//��������     
	     for (int pass = 1; pass < array.length; pass++){
	    	 for (int element = 0;element < (array.length - 1); element++){
	    		 if (array[element] < array[element + 1]){
	    			 swap(array,element,element + 1);
	    		 }  
	    	 }
	     }  
	     
	     return array; 
	 }        
	  public void swap(int array[], int first, int second){//Ԫ����λ
	      int hold; 
	  	  hold = array[first]; 
	      array[first] = array[second];
	      array[second] = hold;
	  }
}
