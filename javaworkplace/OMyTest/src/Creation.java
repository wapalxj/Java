
public class Creation {
	private String name;
	public Creation(String name) {
		this.name=name;
	}
	public Creation() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		System.out.println("running!");
	}
	public static void main(String[] args) {
		Mammml m =new Mammml();
		m.run();
		Human h=new Human();
		h.run();
	}

}

class Mammml extends Creation{
	public Mammml(String name) {
		
	}
	public Mammml() {
		// TODO Auto-generated constructor stub
	}

}
class Human extends Mammml{
	public Human() {
		
	}

}