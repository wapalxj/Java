package C10_Generatic_method;
/**
 * ���ͣ����ƶ�̬
 */
import java.util.ArrayList;
import java.util.List;

public class GenericPolymorphism {
	public static void main(String[] args) {
		//���ƶ�̬
		List<Number> nums=new ArrayList<Number>();
		nums.add(2);//Number��һ�������࣬����������ӵ�ʵ������Number����Integer�Ķ���,���ڱ��������п���
		nums.add(3.14);//Number��һ�������࣬����������ӵ�ʵ������Number����Double�Ķ���,���ڱ��������п���
		for (Number number : nums) {
			System.out.println(number.getClass().getName());
		}
		
		//ʵ�ʲ����γɶ�̬
		List<Integer> ints =new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
//		List<Number> nums2 =ints;//���󣬿μ�ʵ�������ϵĶ�̬�ǲ����е�
//		nums2.add(3.14);
	}
}
