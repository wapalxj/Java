package CC15_2_ListAndQueue;

import java.util.ArrayList;
import java.util.List;
/**
 * indexOf()方法要有作用必须先重写equals方法
 * @author Administrator
 *
 */
public class ListWork1 {

	public static void main(String[] args) {
		List<dog> dogs =new ArrayList<>();
		dogs.add(new dog("vvv"));
		dogs.add(new dog("222"));
		dogs.add(new dog("333"));
		System.out.println(dogs.indexOf(new dog("222")));
	}

}
class dog{
	String name;

	public dog(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass()!= obj.getClass())
			return false;
		dog other = (dog) obj;
		if (name!= other.name)
			return false;
		
		return true;
		
	}
}