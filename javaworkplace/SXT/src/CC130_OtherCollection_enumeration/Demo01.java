package CC130_OtherCollection_enumeration;

import java.util.Enumeration;
import java.util.Vector;

/*Enumeration
 * 1.≈–∂œhasMoreElements()
 * 2.ªÒ»°nextElement()
 */
public class Demo01 {

	public static void main(String[] args) {
		Vector<String> vector =new Vector<String>();
		vector.add("vero");
		vector.add("vnix");
		vector.add("Alicc");
		
		Enumeration<String> en =vector.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
			
		}

	}

}
