package cc116_Generic;
/**
 * ���͵Ĳ���
 * �̳�ʵ������ʱ��ָ������
 * ʹ��ʱҲ��ָ�����ͣ�ͳһ��Object����:
 *����ֻ���൱��Object������ͬ��Object
 *
 * 
 * @author Administrator
 *
 * @param <T>
 * @param <T2>
 */
public class StudentGene2 <T>{
	private T javaScore;
	private T oralcalScore;
//	public <T> name() { //error
//		return 1;
//	}

	public T getJavaScore() {
		return javaScore;
	}


	public void setJavaScore(T javaScore) {
		this.javaScore = javaScore;
	}


	public T getOralcalScore() {
		return oralcalScore;
	}


	public void setOralcalScore(T oralcalScore) {
		this.oralcalScore = oralcalScore;
	}

	
	public static void main(String[] args) {
		StudentGene2<Object> stu= new StudentGene2<Object>();
		StudentGene2 stu1 =new StudentGene2();
		
		//test(stu);//stu1�൱��Object������ͬ��Object
		test1(stu);
		
		test(stu1);//stu1�൱��Object������ͬ��Object
		test1(stu1);
		
	}
	public static void test(StudentGene2<Integer> a) {
		
	}
	public static void test1(StudentGene2<?> a) {
		
	}
}
