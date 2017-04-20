package C11_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P227_Ex8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Gerbil2> gerbils=new ArrayList<>();
		for (int j = 0; j < 3; j++) {
			gerbils.add(new Gerbil2(j));
		}
		Iterator<Gerbil2> it=gerbils.iterator();
		while (it.hasNext()) {
			Gerbil2 gerbil=it.next();
			gerbil.hop();
		}

	}

}

class Gerbil2{
	int gerbilNumber;
	public Gerbil2(int gerbilNumber) {
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