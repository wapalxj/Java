package Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SalaryTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Employee> list=new ArrayList<>();
		System.out.println("��������ȡ�̶����ʵ�Ա���Ĺ�����������ÿ���ڵĹ��ʣ�");
		list.add(new Weeker(in.nextInt(),in.nextDouble()));
		
		System.out.println("��������ȡ��ʱȡ���Ա���Ĺ���Сʱ��,ʱн�ͼӰ�ʱн��");
		list.add(new DailyWorker(in.nextInt(), in.nextInt(), in.nextInt()));
		
		System.out.println("��������ȡ�����۶���ɵ����۶����ɣ�");
		list.add(new Saleman(in.nextInt(),in.nextDouble()));
		
		System.out.println("��������ȡ����н�������۶���ɵ�Ա���ĵ�н�����������������۶����ɣ�");
		list.add(new SalemanBasedSalary(in.nextInt(),in.nextInt(),in.nextInt(),in.nextDouble()));

		System.out.println("�����������ʣ�");
		Iterator<Employee> it =list.iterator();
				while (it.hasNext()) {
					Employee em =it.next();
					em.computeSalary();
					System.out.println(em.getSalary());
				}
		SalemanBasedSalary adds=(SalemanBasedSalary)list.get(3);
		System.out.println("�Դ���н�������۶���ɵĳ�Ա������10%�ĵ�н�����������ӵĵ�н�ٷֱȣ�");
		adds.addbaseSalary(in.nextDouble());
		list.get(3).computeSalary();
		System.out.println("��н��Ա������Ϊ��"+list.get(3).getSalary());
	}
}
