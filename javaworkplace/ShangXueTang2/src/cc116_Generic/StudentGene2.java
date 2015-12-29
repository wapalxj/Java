package cc116_Generic;
/**
 * 泛型的擦除
 * 继承实现声明时不指定类型
 * 使用时也不指定类型：统一用Object代替:
 *但是只是相当于Object，不等同于Object
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
		
		//test(stu);//stu1相当于Object，不等同于Object
		test1(stu);
		
		test(stu1);//stu1相当于Object，不等同于Object
		test1(stu1);
		
	}
	public static void test(StudentGene2<Integer> a) {
		
	}
	public static void test1(StudentGene2<?> a) {
		
	}
}
