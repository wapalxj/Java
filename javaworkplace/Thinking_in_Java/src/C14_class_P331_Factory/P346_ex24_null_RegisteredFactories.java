package C14_class_P331_Factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class P346_ex24_null_RegisteredFactories {

	/**
	 * @param args
	 * 练习24：添加空对象
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			IPart part = Part3.createRandom();
			// Real object
			System.out.println(part);
			// Null companion
			System.out.println(Part3.newNull(part.getClass()));
			}
	}

}

interface Null{}
interface IPart{}

class NullPartProxyHanlder implements InvocationHandler{
	private String nullName;
	private IPart proxied = new NPart();
	public NullPartProxyHanlder(Class<? extends IPart> type) {
		nullName=type.getSimpleName()+": [Null part]";
	}
	//实际空类
	private class NPart implements Null,IPart{
		@Override
		public String toString() {
			return nullName;
		}
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(proxied, args);
	}
}
class Part3 implements IPart{
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	
	public static IPart newNull(Class<? extends IPart> type){
		return (IPart) Proxy.newProxyInstance(
				IPart.class.getClassLoader(), 
				new Class<?>[]{Null.class,IPart.class}, 
				new NullPartProxyHanlder(type));
	}
	
	static List<Factory<IPart>> partFactories=
			new ArrayList<>();
			
	static {
		partFactories.add(new FueFilter3.Factory());
		partFactories.add(new AirFilter3.Factory());
		partFactories.add(new CabinAirFilter3.Factory());
		partFactories.add(new OilFilter3.Factory());
		partFactories.add(new FanBelt3.Factory());
		partFactories.add(new PowerSteeringBelt3.Factory());
		partFactories.add(new GeneratorBelt3.Factory());
	}
	private static Random rand = new Random(47);
	public static IPart createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
	
}

class Filter3 extends Part3{}

class FueFilter3 extends Filter3{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<IPart>{
		public FueFilter3 create(){
			return new FueFilter3();
		}
	}
}

class AirFilter3 extends Filter3{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<IPart>{
		public AirFilter3 create(){
			return new AirFilter3();
		}
	}
}

class CabinAirFilter3 extends Filter3{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<IPart>{
		public CabinAirFilter3 create(){
			return new CabinAirFilter3();
		}
	}
}

class OilFilter3 extends Filter3{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<IPart>{
		public OilFilter3 create(){
			return new OilFilter3();
		}
	}
}

class Belt3 extends Part3{}

class FanBelt3 extends Belt3{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<IPart>{
		public FanBelt3 create(){
			return new FanBelt3();
		}
	}
}

class GeneratorBelt3 extends Belt3{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<IPart>{
		public GeneratorBelt3 create(){
			return new GeneratorBelt3();
		}
	}
}

class PowerSteeringBelt3 extends Belt3{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<IPart>{
		public PowerSteeringBelt3 create(){
			return new PowerSteeringBelt3();
		}
	}
}