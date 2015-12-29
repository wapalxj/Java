package c09_Exception;

public class CatchWho2 {
	public static void main(String[] args) {
		try {
			try {
				throw new ArrayIndexOutOfBoundsException("1111");//此行运行，抛出手动异常.但是内层没有对应的try--catch处理，于是外层try出现异常，对应的交给外层catch处理
			} 
			catch (ArithmeticException e) {//此行不运行
				System.out.println("ArrayIndexOutOfBoundsException"+"内层try--catch");
			}
			throw new ArithmeticException();//此行不运行
			
		} //到此为止，外部的try发生异常 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			}
		catch (ArrayIndexOutOfBoundsException e) {//此行运行
			System.out.println("ArrayIndexOutOfBoundsException"+"外层层try--catch");
//			e.printStackTrace();
		}
	}
}	
