package CC169_Thread;
/*
 *  ʹ��Runnable�����߳�
 *  1.Runnable+run()---����ʵ��ɫ
 *  2.�������߳�:ʹ�þ�̬����
 *  	���������ɫ+��ʵ��ɫ������
 *  	�����߳�
 */
public class T3_Runnable {

	public static void main(String[] args) {
		//1
		Programer programer=new Programer();
		//2
		Thread proxy=new Thread(programer);
		//3
		proxy.start();
		for(int i=0;i<100;i++){
			System.out.println("һ������QQ");
		}
	}

}
//��ʵ��ɫ
class Programer implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("һ����hello world");
		}
	}
		
}