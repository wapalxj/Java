package c09_Exception;

public class CatchWho2 {
	public static void main(String[] args) {
		try {
			try {
				throw new ArrayIndexOutOfBoundsException("1111");//�������У��׳��ֶ��쳣.�����ڲ�û�ж�Ӧ��try--catch�����������try�����쳣����Ӧ�Ľ������catch����
			} 
			catch (ArithmeticException e) {//���в�����
				System.out.println("ArrayIndexOutOfBoundsException"+"�ڲ�try--catch");
			}
			throw new ArithmeticException();//���в�����
			
		} //����Ϊֹ���ⲿ��try�����쳣 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			}
		catch (ArrayIndexOutOfBoundsException e) {//��������
			System.out.println("ArrayIndexOutOfBoundsException"+"����try--catch");
//			e.printStackTrace();
		}
	}
}	
