package cc116_Generic;
/**
 * ��������ת��
 * @author Administrator
 *
 */
public class App {
	public static void main(String[] args) {
		Object obj =80; //�Զ�װ��
		System.out.println(obj.getClass());//�Զ�װ��
		//JDK1.7���Ժ����ֱ����ôת
//		int score =(int)obj;
//		System.out.println(score);
		
		//JDK1.7.��ǰҪ��ôת
//		int v = Integer.parseInt(String.valueOf(obj));
//		System.out.println(v);
//		����
//		int v=(Integer) obj;
//		System.out.println(v);
		
		// ��������int--->Integer--->Object
		Student stu =new Student(80,90);
		int javaseScore =(Integer)stu.getJavase();
		
		String oralcleScore=null;
		oralcleScore =stu.getOracle().toString();
		
//		if (stu.getOracle() instanceof String) {//��ѧ������д���ˣ�������
//			oralcleScore =(String)stu.getOracle();
//		}
	
		System.out.println(javaseScore+" "+oralcleScore);
	}

}
