package c09_Exception;
/**
 * 当一个方法声明抛出多个异常时没在此方法调用语句处只要CATCH其中任何一个异常就能通过编译
 */

import java.io.*;
public class ThrowMultiExceptionsDemo { 
    public static void main(String[] args) 
    	{ 
      try { 
            throwsTest(); 
       } 
        catch(IOException e) { 
            System.out.println("捕捉异常"); 
        }
    }

    private static void throwsTest()  throws ArithmeticException,IOException { 
        System.out.println("这只是一个测试"); 
        // 程序处理过程假设发生异常
        throw new IOException(); 
        //throw new ArithmeticException(); 
    } 
}
