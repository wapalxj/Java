package c59_Moni_ArratList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MyArrayList list =new MyArrayList(4);
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		list.add(new Human("vnix"));
		
		Human h=(Human)list.get(3);//vnix在构造时是Object类型的，这里强制转为Human
		System.out.println(h.getName());
		
		System.out.println(list.get(1));
		System.out.println(list.indexOf("aaa"));
	}

}
