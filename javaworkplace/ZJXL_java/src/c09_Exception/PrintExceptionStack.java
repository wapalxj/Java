package c09_Exception;

//UsingExceptions.java
//Demonstrating the getMessage and printStackTrace
//methods inherited into all exception classes.
public class PrintExceptionStack {
	public static void main( String args[] )
	{
	   try {
	      method1();
	   }
	   catch ( Exception e ) {
	      System.err.println( e.getMessage() + "\n" );//getMessage 包含特定异常的相关信息
	      e.printStackTrace();//打印方法调用堆栈
	   }
	}
	
	public static void method1() throws Exception
	{
	   method2();
	}
	
	public static void method2() throws Exception
	{
	   method3();
	}
	
	public static void method3() throws Exception
	{
	   throw new Exception( "Exception thrown in method3" );
	}
}