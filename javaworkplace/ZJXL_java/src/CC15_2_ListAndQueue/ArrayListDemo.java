package CC15_2_ListAndQueue;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList可以看成是一个动态数组，使用add()方法向其添加元素
		ArrayList<Integer> grades=new ArrayList<>();
		grades.add(100);
		grades.add(90);
		grades.add(80);
		grades.add(70);
		grades.add(60);
		grades.add(50);
		
		//除了使用经典的for循环遍历，ArrayList还支持foreach循环
		Integer total=0;
		System.out.println("原始数据：");
		for(Integer value:grades){
			System.out.println(value);
			total+=value;
		}
		double average=total/grades.size();
		System.out.println("成绩个数:"+grades.size());
		System.out.println("平均分："+average);

		Integer secondInteger=grades.get(1);
		System.out.println("\n第2个元素是："+secondInteger);
		System.out.println("现在移除第2个元素");
		grades.remove(1);
		System.out.println("移除之后的数据集合：");
		for(Integer value:grades){
			System.out.println(value);
			total+=value;
		}
		System.out.println("成绩个数:"+grades.size());
		System.out.println("平均分："+average);
	}

}
