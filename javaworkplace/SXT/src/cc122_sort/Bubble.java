package cc122_sort;
/*
 * ð������
 */
public class Bubble {

	public static void main(String[] args) {
		int [] arr={9,8,7,6,5};
//�����汾		
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				if (arr[j]>arr[j+1]) {
//					int temp =arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
		
//�м��汾
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1-i; j++) {
//				if (arr[j]>arr[j+1]) {
//					int temp =arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
		
//�߼��汾�����Ǵ���˳����ʦ���������д��󣬣�
		int [] arr2={1,2,9,3,4};
		boolean sorted=true;
		for (int i = 0; i < arr.length-1; i++) {
			sorted=true;//�ٶ�����
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {//�������Ϊfalse,��break,
					int temp =arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						sorted=false;//�ٶ�ʧ��
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
