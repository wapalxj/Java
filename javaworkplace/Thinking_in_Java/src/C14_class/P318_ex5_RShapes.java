package C14_class;

import java.util.Arrays;
import java.util.List;

public class P318_ex5_RShapes {
	public static void main(String[] args) {
		List<RShape> rshapes=Arrays.asList(new RCircle(),new RSquare(),new RTriangle(),new RRhomboid());
		for (RShape rshape : rshapes) {
			rshape.draw();
			try {
				rshape.rotate(100);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			
		}
	}
}

abstract class RShape{
	void draw(){
		System.out.println(this+".draw()");
	}
	abstract public String toString();
	void rotate(int degrees){
		System.out.println("Rotating " + this +
				" by " + degrees + " degrees");
	};
}

class RCircle extends RShape{
	@Override
	public String toString() {
		return "Circle";
	}
	@Override
	void rotate(int degrees) {
		throw new UnsupportedOperationException();
	}
}

class RSquare extends RShape{
	@Override
	public String toString() {
		return "Square";
	}
}

class RTriangle extends RShape{
	@Override
	public String toString() {
		return "Triangle";
	}
}

class RRhomboid extends RShape{
	@Override
	public String toString() {
		return "Rhomboid";
	}
}