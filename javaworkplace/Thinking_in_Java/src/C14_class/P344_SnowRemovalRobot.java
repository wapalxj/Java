package C14_class;

import java.util.Arrays;
import java.util.List;

public class P344_SnowRemovalRobot {

	/**
	 * @param args
	 * 空对象2
	 */
	public static void main(String[] args) {
		SnowRemovalRobot.main(args);
	}

}
//实际类
class SnowRemovalRobot implements Robot{
	private String name;
	public SnowRemovalRobot(String name) {
		this.name=name;
	}
	@Override
	public String name() {
		return name;
	}

	@Override
	public String model() {
		return "Snow Series 11";
	}

	@Override
	public List<Operation> operations() {
		return Arrays.asList(new Operation(){
			@Override
			public String description() {
				return name +" can shoval snow";
			}
			@Override
			public void command() {
				System.out.println(name +" shovaling snow");
			}
			
		},new Operation(){

			@Override
			public String description() {
				return name +" can chip ice";
			}

			@Override
			public void command() {
				System.out.println(name +" chipping ice");
			}
			
		},new Operation(){

			@Override
			public String description() {
				return name +" can clear roof";
			}

			@Override
			public void command() {
				System.out.println(name +" clearing roof");
				
			}
			
		});
	}
	
	public static void main(String[] args) {
		Test.test(new SnowRemovalRobot("Vero"));
	}
}