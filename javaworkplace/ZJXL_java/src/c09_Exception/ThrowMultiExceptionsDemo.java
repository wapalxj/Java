package c09_Exception;
/**
 * ��һ�����������׳�����쳣ʱû�ڴ˷���������䴦ֻҪCATCH�����κ�һ���쳣����ͨ������
 */

import java.io.*;
public class ThrowMultiExceptionsDemo { 
    public static void main(String[] args) 
    	{ 
      try { 
            throwsTest(); 
       } 
        catch(IOException e) { 
            System.out.println("��׽�쳣"); 
        }
    }

    private static void throwsTest()  throws ArithmeticException,IOException { 
        System.out.println("��ֻ��һ������"); 
        // ��������̼��跢���쳣
        throw new IOException(); 
        //throw new ArithmeticException(); 
    } 
}
