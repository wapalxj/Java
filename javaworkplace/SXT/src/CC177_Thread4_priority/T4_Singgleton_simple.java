package CC177_Thread4_priority;

/*
 * �������ģʽ:���̵߳�
 * 1.������˽�л�
 * 2.����һ��˽�о�̬����
 * 3.�ṩ����Ĺ�����̬����
 */
public class T4_Singgleton_simple {

	public static void main(String[] args) {
		Jvm j1=Jvm.single();
		Jvm j2=Jvm.single();
		System.out.println(j1==j2);
	}

}
class Jvm{
	private static Jvm instance=null;
	
	private Jvm(){
		
	}
	public static Jvm single(){
		if (instance==null) {
			instance=new Jvm();
		}
		return instance;
	}
}