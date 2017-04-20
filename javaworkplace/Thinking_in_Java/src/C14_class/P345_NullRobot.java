package C14_class;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

public class P345_NullRobot {

	/**
	 * @param args
	 * 空对象2：动态代理
	 */
	public static void main(String[] args) {
		NullRobot.main(args);
	}

}

class NullRobotProxyHandler implements InvocationHandler{
	private String nullName;
	private Robot proxied=new NRobot();
	
	public NullRobotProxyHandler(Class<? extends Robot> type) {
		nullName=type.getSimpleName()+" NullRobot";
	}
	
	//实际空类
	private class NRobot implements Null,Robot{
		@Override
		public String name() {
			return nullName;
		}

		@Override
		public String model() {
			return nullName;
		}

		@Override
		public List<Operation> operations() {
			return Collections.emptyList();
		}
		
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
//		System.out.print(proxy.getClass());
		return method.invoke(proxied, args);
	}
}

class NullRobot{
	//动态代理
	public static Robot newNullRobot(Class<? extends Robot> type) {
		return (Robot) Proxy.newProxyInstance(
				NullRobot.class.getClassLoader(), 
				new Class[]{Null.class,Robot.class},
				new NullRobotProxyHandler(type));
	}
	
	public static void main(String[] args) {
//		Robot[] bots={new SnowRemovalRobot("SnwBee"),
//				newNullRobot(SnowRemovalRobot.class)};
//		for (Robot robot : bots) {
//			Robot.Test.test(robot);
//		}
		
		Robot.Test.test(new SnowRemovalRobot("SnwBee"));
		System.out.println("======================");
		Robot.Test.test(newNullRobot(SnowRemovalRobot.class));
	}
}