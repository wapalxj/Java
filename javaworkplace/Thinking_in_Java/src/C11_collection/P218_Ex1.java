package C11_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class P218_Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Gerbil2> gerbils=new ArrayList<>();
		for (int j = 0; j < 3; j++) {
			gerbils.add(new Gerbil2(j));
		}
		
		for (int i = 0; i < gerbils.size(); i++) {
			gerbils.get(i).hop();
		}
	}

}

class Gerbil{
	int gerbilNumber;
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber=gerbilNumber;
	}
	public void hop() {
		System.out.println(this+" is hopping");
	}
	
	@Override
	public String toString() {
		return "gerbil"+gerbilNumber;
	}
}