package cc122_sort;
/*
 * Comperable½Ó¿Ú:Ã°ÅÝ×Ö·û´®ÅÅÐò
 */
public class BubbleString {

	public static void main(String[] args) {
		String[] arr={"a","abcd","abc","def"};

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (((Comparable)arr[j]).compareTo(arr[j+1])>0) {
					String temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (String i : arr) {
			System.out.println(i);
		}
	}

}
