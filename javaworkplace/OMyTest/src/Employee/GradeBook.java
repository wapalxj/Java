package Employee;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class GradeBook {
	Map<String , int[]> Gradetable;
	
	public GradeBook(Map<String , int[]> students) {
		Gradetable=students;
	}
	
	public void getMax() {
		int max[] = new int[10];
			Set iter =Gradetable.keySet();
			Iterator dataIte = iter.iterator();
	
			while (dataIte.hasNext()) {
				String key = (String)dataIte.next();
				int[] value = Gradetable.get(key);
				for (int j = 0; j <value.length; j++) {
					if ( max[j]<value[j]) {
						max[j]=value[j];
					}
				}
			}
			
			for (int k = 0; k < max.length; k++) {
				if (max[k]>0) {
					System.out.println("第"+(k+1)+"门课的最高成绩是"+max[k] );
				}
				
			}	
	}
	
	public void getMin() {
		int min[] = new int[10];
			Set iter =Gradetable.keySet();
			Iterator dataIte = iter.iterator();
			String ke= (String)dataIte.next();
			int[] v = Gradetable.get(ke);
			for (int i = 0; i < v.length; i++) {
				min[i]=v[i];
			}
			while (dataIte.hasNext()) {
				String key = (String)dataIte.next();
				int[] value = Gradetable.get(key);
				for (int j = 0; j <value.length; j++) {
					if ( min[j]>value[j]) {
						min[j]=value[j];
					}
				}
			}
			
			for (int k = 0; k < min.length; k++) {
				if (min[k]>0) {
					System.out.println("第"+(k+1)+"门课的最低成绩是"+min[k] );
				}
				
			}	
	}
	public void getAvg() {
		int min[] = new int[10];
			Set iter =Gradetable.keySet();
			Iterator dataIte = iter.iterator();
	
			while (dataIte.hasNext()) {
				String key = (String)dataIte.next();
				int[] value = Gradetable.get(key);
				for (int j = 0; j <value.length; j++) {
						min[j]+=value[j];
				}
			}
			
			for (int k = 0; k < min.length; k++) {
				if (min[k]>0) {
					System.out.println("第"+(k+1)+"门课的平均成绩是"+min[k]*1.0/Gradetable.size() );
				}
				
			}	
	}
	public void getView() {
		int view[] = new int[10];
		int k=0;
			Set iter =Gradetable.keySet();
			Iterator dataIte = iter.iterator();
	
			while (dataIte.hasNext()) {
				String key = (String)dataIte.next();
				int[] value = Gradetable.get(key);
				for (int j = 0; j <value.length; j++) {
					if (value[j]<10) {
						view[0]++;
					}
					if (value[j]<20&&value[j]>=10) {
						view[1]++;
					}
					if (value[j]<30&&value[j]>=20) {
						view[2]++;
					}
					if (value[j]<40&&value[j]>=30) {
						view[3]++;
					}
					if (value[j]<50&&value[j]>=40) {
						view[4]++;
					}
					if (value[j]<60&&value[j]>=50) {
						view[5]++;
					}
					if (value[j]<70&&value[j]>=60) {
						view[6]++;
					}
					if (value[j]<80&&value[j]>=70) {
						view[7]++;
					}
					if (value[j]<90&&value[j]>=80) {
						view[8]++;
					}
					if (value[j]<=100&&value[j]>=90) {
						view[9]++;
					}
				}
				
			}
			for (int i = 0; i < view.length; i++) {
				if ( view[i]>0) {
					System.out.print(i*10+"---"+(i+1)*10+"之间是分数是： ");
					for (int j = 0; j < view[i]; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
			}
			

	}
	
}
