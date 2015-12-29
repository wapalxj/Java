package CC15_5_Works;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Co3_RandomAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double []rand=new Double[100];
		for (int i = 0; i < rand.length; i++) {
			rand[i]=Math.random()*1000;
		}
//		Arrays.sort(rand);
		List<Double> list =Arrays.asList(rand);
		Collections.sort(list);//≈≈–Ú
		Collections.reverse( list );//Ωµ–Ú
		for (double d : rand) {
			System.out.println(d);
		}
	}

}
