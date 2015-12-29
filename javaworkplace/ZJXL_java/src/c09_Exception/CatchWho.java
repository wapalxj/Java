package c09_Exception;

public class CatchWho {
	public static void main(String[] args) {
		try {
			try {
				throw new ArrayIndexOutOfBoundsException("第一个异常");//此行运行的结果：手动抛出一个异常，下面的try-cantch就会处理我们跑出来的异常
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("AIOOBE"+"/内层try--catch");
				e.printStackTrace();
			}
			//上面代码正常运行，此行接着运行
			throw new ArithmeticException();//此行运行的结果：再手动抛出一个异常，下面的对应的try-cantch就会处理我们跑出来的异常
		}//到此为止，外部的try语句全部正常运行 
		catch (ArithmeticException e) {
			System.out.println("发生ArithmeticException");
//			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOOBE"+"外层try--catch");
		
		}
	}	
}
