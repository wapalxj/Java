package android.imooc.retrofit.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 */
public class Proxy implements InvocationHandler {
    private Object target;//要代理的真实对象

    public Proxy(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy -----真实对象
     * @param method -----真实对象的方法
     * @param args   -----真实对象的方法参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy2222:"+proxy.getClass().getSimpleName());

        System.out.println("before...");
        method.invoke(target,args);
        System.out.println("after...");
        return null;
    }
}
