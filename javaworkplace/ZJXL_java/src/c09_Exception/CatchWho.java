package c09_Exception;

public class CatchWho {
	public static void main(String[] args) {
		try {
			try {
				throw new ArrayIndexOutOfBoundsException("��һ���쳣");//�������еĽ�����ֶ��׳�һ���쳣�������try-cantch�ͻᴦ�������ܳ������쳣
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("AIOOBE"+"/�ڲ�try--catch");
				e.printStackTrace();
			}
			//��������������У����н�������
			throw new ArithmeticException();//�������еĽ�������ֶ��׳�һ���쳣������Ķ�Ӧ��try-cantch�ͻᴦ�������ܳ������쳣
		}//����Ϊֹ���ⲿ��try���ȫ���������� 
		catch (ArithmeticException e) {
			System.out.println("����ArithmeticException");
//			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOOBE"+"���try--catch");
		
		}
	}	
}
