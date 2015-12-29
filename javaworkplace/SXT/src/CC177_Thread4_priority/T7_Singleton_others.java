package CC177_Thread4_priority;
/*
 * ����ģʽ������д��
 * 1.����ʽ
 * 2.����ʽ
 */
public class T7_Singleton_others {

	public static void main(String[] args) {
		
	}

}
//1.����ʽ
class MyJvm{
	private static MyJvm instance=null;
		
		private MyJvm(){
			
		}
		public static  MyJvm single(){
			//2��if��˫�ؼ�飬���Ч��
			if (instance==null) {//��һ�����Ч��
				synchronized(MyJvm.class){
					if (instance==null) {//����
						instance=new MyJvm();
					}					
				}
			}
			return instance;
		}
}

//2.����ʽ
class MyJvm2{
	private static MyJvm2 instance=new MyJvm2();
		private MyJvm2(){
			
		}
		public static  MyJvm2 single(){
			return instance;
		}
}

//3.�ӻ��˼���ʱ��
class MyJvm3{
	private static class JVMholder{
		private static MyJvm3 instance=new MyJvm3();

	}
	private MyJvm3(){
		
	}
	public static  MyJvm3 single(){
		return JVMholder.instance;
	}
}
