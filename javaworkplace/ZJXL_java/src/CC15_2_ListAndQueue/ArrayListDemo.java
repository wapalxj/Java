package CC15_2_ListAndQueue;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList���Կ�����һ����̬���飬ʹ��add()�����������Ԫ��
		ArrayList<Integer> grades=new ArrayList<>();
		grades.add(100);
		grades.add(90);
		grades.add(80);
		grades.add(70);
		grades.add(60);
		grades.add(50);
		
		//����ʹ�þ����forѭ��������ArrayList��֧��foreachѭ��
		Integer total=0;
		System.out.println("ԭʼ���ݣ�");
		for(Integer value:grades){
			System.out.println(value);
			total+=value;
		}
		double average=total/grades.size();
		System.out.println("�ɼ�����:"+grades.size());
		System.out.println("ƽ���֣�"+average);

		Integer secondInteger=grades.get(1);
		System.out.println("\n��2��Ԫ���ǣ�"+secondInteger);
		System.out.println("�����Ƴ���2��Ԫ��");
		grades.remove(1);
		System.out.println("�Ƴ�֮������ݼ��ϣ�");
		for(Integer value:grades){
			System.out.println(value);
			total+=value;
		}
		System.out.println("�ɼ�����:"+grades.size());
		System.out.println("ƽ���֣�"+average);
	}

}
