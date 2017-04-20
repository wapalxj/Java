package C14_class_P331_Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 * 注册工厂
 * @author mgh2569702
 *
 */
public class RegisteredFactories {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Part.createRandom());
		}
	}

}

class Part{
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	
	static List<Factory<? extends Part>> partFactories=
			new ArrayList<>();
	static{
		partFactories.add(new FueFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	
	private static Random rand=new Random(47);
	
	public static Part createRandom() {
		int n=rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}

class Filter extends Part{}

class FueFilter extends Filter{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<FueFilter>{
		public FueFilter create(){
			return new FueFilter();
		}
	}
}

class AirFilter extends Filter{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<AirFilter>{
		public AirFilter create(){
			return new AirFilter();
		}
	}
}

class CabinAirFilter extends Filter{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<CabinAirFilter>{
		public CabinAirFilter create(){
			return new CabinAirFilter();
		}
	}
}

class OilFilter extends Filter{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<OilFilter>{
		public OilFilter create(){
			return new OilFilter();
		}
	}
}

class Belt extends Part{}

class FanBelt extends Belt{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<FanBelt>{
		public FanBelt create(){
			return new FanBelt();
		}
	}
}

class GeneratorBelt extends Belt{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<GeneratorBelt>{
		public GeneratorBelt create(){
			return new GeneratorBelt();
		}
	}
}

class PowerSteeringBelt extends Belt{
	public static class Factory implements 
			C14_class_P331_Factory.Factory<PowerSteeringBelt>{
		public PowerSteeringBelt create(){
			return new PowerSteeringBelt();
		}
	}
}