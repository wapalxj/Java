package cc116_Generic;
/**
 * ����:������ʹ��ʱָ����ֻ��ʹ����������
 *������ʱ����ʹ���ھ�̬���ԣ���̬������,��Ϊ<T>�ľ�������������ʱ��ȷ��
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
		stu.setOralcalScore(100);//�Զ������ͼ����ת��
		int i=stu.getOralcalScore();//�Զ�����
		System.out.println(i);

	}
}
