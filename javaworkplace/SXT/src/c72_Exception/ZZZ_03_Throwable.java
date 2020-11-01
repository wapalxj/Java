package c72_Exception;

/**
 * Created by Administrator on 2016/6/5.
 */
public class ZZZ_03_Throwable {
    public static void main(String[] args) throws InterruptedException {
        try{
            int a=1/0;
            throw new Error("An error occurs here");
//            throw new Exception("An exception occurs here");
//            throw new Throwable("An throwable occurs here");
        } catch (Throwable throwable) {
            System.out.println("xxxxxxxxxxxx");
            throwable.printStackTrace();
        }

        //异常被捕获，程序并不会终止
        for (int i = 0; i < 100; i++) {
            Thread.sleep(300);
            System.out.println("main,,,"+i);
        }
        System.out.println(changeStr("[]{}\""));
    }

    public static String changeStr(String json){
        json.replaceAll(",","，");
        json.replaceAll(":","：");
        json.replaceAll("\\[","【");
        json.replaceAll("\\]","】");
        json.replaceAll("\\{","<");
        json.replaceAll("\\}",">");
        json.replaceAll("\"","“");
        return json.toString();
    }
}

