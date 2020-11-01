package android.imooc.retrofit.hook;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//hook方式2：动态代理
public class PrivatePlaneProxyHandler implements InvocationHandler {
    private Object object;

    public PrivatePlaneProxyHandler(Object object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if ("maxSpeed".equals(method.getName())) {
            System.out.println("动态代理，拦截maxSpeed----------------");
            return 180;
        }
        return method.invoke(object,args);
    }
}
