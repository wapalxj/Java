package C14_class;

public class P337_SimpleProxyDe {

	/**
	 * @param args
	 * 代理设计模式
	 */
	public static void main(String[] args) {
		SimpleProxyDemo.main(args);
	}

}

interface Interface{
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface{

	@Override
	public void doSomething() {
		System.out.println("doSomething");
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("doSomething "+arg);
	}
}

class SimpleProxy implements Interface{
	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied=proxied;
	}
	@Override
	public void doSomething() {
		System.out.println("SimpleProxy doSomething");
		proxied.doSomething();
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("SimpleProxy somethingElse "+arg);
		proxied.somethingElse(arg);
	}
}

class SimpleProxyDemo{
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("vero");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		System.out.println("==================");
		consumer(new SimpleProxy(new RealObject()));
	}
}