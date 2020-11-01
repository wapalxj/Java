package android.imooc.retrofit.hook;

import java.lang.reflect.Field;

//hook方式1：反射替换
public class ReflectTest {
    public static void main(String[] args) {
        PrivatePlane privatePlane=new PrivatePlane();
        privatePlane.showMaxSpeed();
        System.out.println("----------------反射替换前----------------");
        try {
            Field carEngineField=PrivatePlane.class.getDeclaredField("privatePlaneEngineInterface");
            carEngineField.setAccessible(true);
            //获取privatePlaneEngine对象
            PrivatePlaneEngine privatePlaneEngine= (PrivatePlaneEngine) carEngineField.get(privatePlane);
            //替换成员变量
            carEngineField.set(privatePlane,new ReflectPrivatePlane(privatePlaneEngine));
            System.out.println("----------------反射替换后----------------");
            privatePlane.showMaxSpeed();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}

