package c09_Exception;


public class SystemExitAndFinally {

    public static void main(String[] args)
    {
        try{
            System.out.println("in main");
            throw new Exception("Exception is thrown in main");
//            System.exit(0);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(0);//此行已经关闭程序，finally不再执行
        }
        finally
        {
            System.out.println("in finally");
        }
    }

}


