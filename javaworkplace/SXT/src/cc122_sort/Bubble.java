package cc122_sort;
/*
 * 冒泡排序
 */
public class Bubble {

	public static void main(String[] args) {
		int [] arr={9,8,7,6,5};
//初级版本		
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				if (arr[j]>arr[j+1]) {
//					int temp =arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
		
//中级版本
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1-i; j++) {
//				if (arr[j]>arr[j+1]) {
//					int temp =arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
		
//高级版本：考虑存在顺序（老师所讲可能有错误，）
		int [] arr2={1,2,9,3,4};
		boolean sorted=true;
		for (int i = 0; i < arr.length-1; i++) {
			sorted=true;//假定有序
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {//如果此行为false,则break,
					int temp =arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						sorted=false;//假定失败
					}
			}
			if (sorted) {
				break;
			}
		
		}	
		for (int i : arr2) {
			System.out.println(i);
		}
	}

}
