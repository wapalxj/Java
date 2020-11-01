package android.imooc.retrofit.hook;


import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

//hook方式2：动态代理
public class ProxyTest {
    public static void main(String[] args) {
        PrivatePlane privatePlane=new PrivatePlane();
        privatePlane.showMaxSpeed();
        System.out.println("----------------动态代理替换前----------------");
        try {
            Field carEngineField=PrivatePlane.class.getDeclaredField("privatePlaneEngineInterface");
            carEngineField.setAccessible(true);
            //获取privatePlaneEngine对象
            PrivatePlaneEngine carEngine= (PrivatePlaneEngine) carEngineField.get(privatePlane);
            PrivatePlaneEngineInterface carEngineProxy= (PrivatePlaneEngineInterface) Proxy.newProxyInstance(
                    PrivatePlaneEngine.class.getClassLoader(),
                    new Class[]{PrivatePlaneEngineInterface.class},
                    new PrivatePlaneProxyHandler(carEngine)
            );


            //替换成员变量
            carEngineField.set(privatePlane,new ReflectPrivatePlane(carEngineProxy));
            System.out.println("----------------动态代理替换后----------------");
            privatePlane.showMaxSpeed();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
