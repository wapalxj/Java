package C14_class;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class P338_SimpleDynamicProxy {

	/**
	 * @param args
	 * 动态代理
	 */
	public static void main(String[] args) {
		SimpleDynamicProxy.main(args);
	}

}

class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	
	public DynamicProxyHandler(Object proxied) {
		this.proxied=proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("**** proxy:"+proxy.getClass()+
				", method: "+method+", args: "+args);
		return method.invoke(proxied, args);
	}
}

class SimpleDynamicProxy{
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("vero");
	}
	
	public static void main(String[] args) {
		RealObject real=new RealObject();
		consumer(real);
		System.out.println("==================");
		//Insert a proxy and call again
		Interface proxy=(Interface) Proxy.newProxyInstance(
				Interface.class.getClassLoader(), 
				new Class[]{Interface.class},
				new DynamicProxyHandler(real)
				);
		consumer(proxy);
	}
}