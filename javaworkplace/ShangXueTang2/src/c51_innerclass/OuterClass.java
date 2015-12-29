package c51_innerclass;

public class OuterClass {
	public static void main(String[] args) {
		Face.Nose n= new Face().new Nose();
		n.breathe();
		
		Face.Ear e= new Face.Ear();
		e.listen();
	}
}

class Face{
	int type;
	static String color="ºìÈó";
	
	class Nose{
		String type;
		
		void breathe(){
			System.out.println(Face.this.type);
			System.out.println("ºôÎü");
		}
	}
	
	static class Ear{
		String type;
		
		void listen(){
//			System.out.println(Face.this.type);
			System.out.println("Ìý");
			System.out.println(color);
		}
	}
}
