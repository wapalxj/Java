package cc116_Generic;
/**
 * 泛型:类型在使用时指定：只能使用引用类型
 *声明的时候不能使用在静态属性，静态方法上,因为<T>的具体类型在运行时才确定
 * @author Administrator
 *
 * @param <T1>
 * @param <T2>
 */
public class StudentGene <T1,T2>{
	private T1 javaScore;
	private T2 oralcalScore;

	public T1 getJavaScore() {
		return javaScore;
	}


	public void setJavaScore(T1 javaScore) {
		this.javaScore = javaScore;
	}


	public T2 getOralcalScore() {
		return oralcalScore;
	}


	public void setOralcalScore(T2 oralcalScore) {
		this.oralcalScore = oralcalScore;
	}


	public static void main(String[] args) {
		StudentGene<String,Integer> stu= new StudentGene<String,Integer>();
		StudentGene<String,String> stu2= new StudentGene<String,String>();
		stu.setOralcalScore(100);//自动的类型检查与转换
		int i=stu.getOralcalScore();//自动拆箱
		System.out.println(i);

	}
}
