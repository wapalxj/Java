package Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SalaryTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Employee> list=new ArrayList<>();
		System.out.println("请输入领取固定工资的员工的工作星期数和每星期的工资：");
		list.add(new Weeker(in.nextInt(),in.nextDouble()));
		
		System.out.println("请输入领取计时取酬的员工的工作小时数,时薪和加班时薪：");
		list.add(new DailyWorker(in.nextInt(), in.nextInt(), in.nextInt()));
		
		System.out.println("请输入领取按销售额提成的销售额和提成：");
		list.add(new Saleman(in.nextInt(),in.nextDouble()));
		
		System.out.println("请输入领取带底薪并按销售额提成的员工的底薪，工作星期数，销售额和提成：");
		list.add(new SalemanBasedSalary(in.nextInt(),in.nextInt(),in.nextInt(),in.nextDouble()));

		System.out.println("计算上述工资：");
		Iterator<Employee> it =list.iterator();
				while (it.hasNext()) {
					Employee em =it.next();
					em.computeSalary();
					System.out.println(em.getSalary());
				}
		SalemanBasedSalary adds=(SalemanBasedSalary)list.get(3);
		System.out.println("对带底薪并按销售额提成的成员工增加10%的底薪，请输入增加的底薪百分比：");
		adds.addbaseSalary(in.nextDouble());
		list.get(3).computeSalary();
		System.out.println("提薪后员工工资为："+list.get(3).getSalary());
	}
}
